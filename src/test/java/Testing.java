import static org.junit.Assert.*;
import org.junit.Test;

public class Testing {

    @org.junit.Test
    public void testPositive(){
        Addition m = new Addition();
        assertEquals(m.add(2,3), 5);
    }

}
