import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaper(), 0.01);
    }

    @Test
    public void canPrint(){
        assertEquals(90, printer.print(5,2), 0.01);
    }

    @Test
    public void hasToner(){
        assertEquals(500, printer.getTonerVolume(), 0.01);
    }

}
