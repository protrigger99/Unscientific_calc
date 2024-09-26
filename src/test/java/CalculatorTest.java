import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Main calculator;

    @Before
    public void setUp() {
        calculator = new Main(); // Main doesn't need to have a state, but instantiated for method access
    }

    @Test
    public void testFactorial() {
        // Test factorial of 0
        Assert.assertEquals(1, Main.factorial(0));

        // Test factorial of a positive number
        Assert.assertEquals(1, Main.factorial(1));
        Assert.assertEquals(2, Main.factorial(2));
        Assert.assertEquals(6, Main.factorial(3));
        Assert.assertEquals(120, Main.factorial(5));
    }

    @Test
    public void testSquareRoot() {
        // Test square root of positive numbers
        Assert.assertEquals(2.0, Math.sqrt(4), 0.0001);
        Assert.assertEquals(3.0, Math.sqrt(9), 0.0001);
        Assert.assertEquals(1.4142, Math.sqrt(2), 0.0001); // for non-perfect square roots

        // Test square root of 0
        Assert.assertEquals(0.0, Math.sqrt(0), 0.0001);
    }

    @Test
    public void testNaturalLogarithm() {
        // Test natural logarithm of positive numbers
        Assert.assertEquals(0.0, Math.log(1), 0.0001); // ln(1) = 0
        Assert.assertEquals(1.0, Math.log(Math.E), 0.0001); // ln(e) = 1

        // Test natural logarithm of non-e base
        Assert.assertEquals(0.6931, Math.log(2), 0.0001);
    }

    @Test
    public void testPowerFunction() {
        // Test base raised to power
        Assert.assertEquals(1.0, Math.pow(2, 0), 0.0001); // 2^0 = 1
        Assert.assertEquals(4.0, Math.pow(2, 2), 0.0001); // 2^2 = 4
        Assert.assertEquals(8.0, Math.pow(2, 3), 0.0001); // 2^3 = 8
        Assert.assertEquals(9.0, Math.pow(3, 2), 0.0001); // 3^2 = 9
    }
}
