import org.dev.devmodule3.SumCalculator;
import org.junit.jupiter.api.Assertions;
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
       //When
        int actual = calculator.sum(1);
        int actual2 = calculator.sum(3);
        //Then
         int expected = 1;
      int expected2 = 6;
        Assertions.assertEquals(expected,actual);
      Assertions.assertEquals(expected2,actual2);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.sum(0);
        });

    }
}
