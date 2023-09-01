package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
        Person person = new Person();
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.NULLPERSON, result);
    }
    // TODO Complete with more test cases
    @Test
    public void testPersonWithoutParameters() {
        Person person = new Person();
        Assert.assertNull(person.getName());
        Assert.assertEquals(0, person.getId());
        Assert.assertEquals(0, person.getAge());
        Assert.assertNull(person.getGender());
        Assert.assertFalse(person.isAlive());
    }

    @Test
    public void validatNegativedAge(){
        Person person = new Person();
        person.setName("Johann");
        person.setAge(-10);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    @Test
    public void validateAge0To18(){
        Person person = new Person();
        person.setName("Johann");
        person.setAge(0);
        RegisterResult result1 = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result1);

        person.setAge(10);
        RegisterResult result2 = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result2);

        person.setAge(18);
        RegisterResult result3 = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result3);
    }

    @Test
    public void validetAreadyVoted(){
        Person person = new Person();
        person.setName("Johann");
        person.setAge(18);
        person.setVoted();
        RegisterResult result1 = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DUPLICATED, result1);
    }

    @Test
    public void validetIsAlive(){
        Person person = new Person();
        person.setName("Johann");
        RegisterResult result1 = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result1);
    }
}