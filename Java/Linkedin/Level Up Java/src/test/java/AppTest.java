import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test
    public void isEven_true() {
        assertTrue(Main.isEven(0));
        assertTrue(Main.isEven(2));
        assertTrue(Main.isEven(100));
        assertTrue(Main.isEven(26));
        assertTrue(Main.isEven(-36));
    }
    @Test
    public void isEven_false(){
        assertFalse(Main.isEven(1));
        assertFalse(Main.isEven(39));
        assertFalse(Main.isEven(-5));
    }
}
