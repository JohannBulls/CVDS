package edu.eci.cvds.tdd.registry;
public class Registry {
    public RegisterResult registerVoter(Person p) {

        if (p.getGender() == null && p.getName() == null){
            return RegisterResult.NULLPERSON;
        } 
        if(!p.isAlive()){
            return RegisterResult.DEAD;
        }
        if (p.getAge() < 18 && p.getAge() >= 0){
            return RegisterResult.UNDERAGE;
        }

        if (p.getAge() < 0 || p.getAge() > 120) {
            return RegisterResult.INVALID_AGE;
        }  

        

        if(p.alreadyVoted()){
            return RegisterResult.DUPLICATED;
        }

        else{
            return RegisterResult.VALID;
        }
    }
}