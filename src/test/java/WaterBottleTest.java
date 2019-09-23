import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume(), 0.01);
    }

    @Test
    public void canTakeDrinkFromBottle(){
        assertEquals(90, waterBottle.takeDrink(), 0.01);
    }

    @Test
    public void canEmptyTheBottle(){
        assertEquals(0, waterBottle.emptyBottle(), 0.01);
    }

    @Test
    public void canRefillBottle(){
        assertEquals(100, waterBottle.fillBottle(), 0.01);
    }
}
