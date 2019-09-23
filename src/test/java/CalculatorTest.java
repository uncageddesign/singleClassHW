import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

        Calculator calculator;

        @Before
        public void before(){
            calculator = new Calculator(4, 2);
        }

        @Test
        public void hasValueOne(){
            assertEquals(4, calculator.getValueOne(), 0.01);
        }

        @Test
        public void hasValueTwo(){
            assertEquals(2, calculator.getValueTwo(), 0.01);
        }

        @Test
        public void canAddValues(){
            assertEquals(6, calculator.addValues(), 0.01);
        }

        @Test
        public void canSubtractValues(){
            assertEquals(2, calculator.subtractValues(), 0.01);
        }

        @Test
        public void canMultiplyValues(){
            assertEquals(8, calculator.multiplyValues(), 0.01);
        }

        @Test
        public void canDivideValues(){
            assertEquals(2, calculator.divideValues(), 0.01);
        }

}
