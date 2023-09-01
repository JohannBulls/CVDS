/*package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;

public class TarifasTest {
    private CalculadorDescuentos calculador = new CalculadorDescuentos();

    @Test
    public void testDescuentoAntelacionMayorA20() {
        long tarifaBase = 100000; // Ejemplo de tarifa base
        int diasAntelacion = 21; // Antelación mayor a 20 días
        int edad = 25; // Ejemplo de edad

        BigDecimal descuento = new BigDecimal("0.15"); // 15% de descuento
        BigDecimal tarifaBaseBigDecimal = BigDecimal.valueOf(tarifaBase);
        BigDecimal tarifaEsperada = tarifaBaseBigDecimal.multiply(BigDecimal.ONE.subtract(descuento));

        long tarifaConDescuento = calculador.calculoTarifa(tarifaBase, diasAntelacion, edad);

        Assert.assertEquals(tarifaEsperada.longValue(), tarifaConDescuento);
}



    @Test
    public void testDescuentoEdadMenor18() {
        long tarifaBase = 100000; // Ejemplo de tarifa base
        int diasAntelacion = 10; // Antelación menor a 20 días
        int edad = 15; // Edad menor a 18

        long tarifaConDescuento = calculador.calculoTarifa(tarifaBase, diasAntelacion, edad);
        long tarifaEsperada = (long) (tarifaBase * 0.85); // 15% de descuento por antelación

        Assert.assertEquals(tarifaEsperada, tarifaConDescuento);
    }

    // Agrega más pruebas para otros casos de descuento según la normativa 005
}
*/