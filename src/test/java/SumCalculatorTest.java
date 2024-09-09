import org.dev.devmodule3.SumCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    public void beforeEach(){
        calculator = new SumCalculator();
    }

    @Test
    public void sumTest(){
       
        System.out.println(calculator.sum(3));
        System.out.println(calculator.sum(1));
        System.out.println(calculator.sum(0));
    }
}
