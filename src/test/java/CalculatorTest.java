import org.junit.*;

import static org.junit.Assert.*;
public class CalculatorTest {
    @Test
    public void shouldReturn2When1Plus1() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(1,1,"Add");
        int expectResult = 2;
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void shouldReturn0When1Sub1() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(1,1,"Sub");
        int expectResult = 0;
        Assert.assertEquals(expectResult, actualResult);
    }

    @Test
    public void shouldReturn0When2Mul2() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(2,2,"Mul");
        int expectResult = 4;
        Assert.assertEquals(expectResult, actualResult);
    }
}