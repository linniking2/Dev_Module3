import org.dev.devmodule3.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    public void beforeEach(){
        calculator = new SumCalculator();
    }

    @Test
    public void sumTestFor1(){
       //When
        int actual = calculator.sum(1);

        //Then
         int expected = 1;

        Assertions.assertEquals(expected,actual);



    }
    @Test
    public void sumTestFor6(){
        //When
        int actual2 = calculator.sum(3);
        //Then
        int expected2 = 6;
        Assertions.assertEquals(expected2,actual2);
    }
    @Test
    public void checkIfSumThrowsException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}
