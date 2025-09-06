import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void rec() {
        assertEquals(10, Main.rec(5, 2));
        assertEquals(0, Main.rec(0, 5));
        assertEquals(-6, Main.rec(2, -3));
    }

    @Test
    void cycle() {
        assertEquals(10, Main.cycle(5, 2));    
        assertEquals(2, Main.cycle(1, 2));    
        assertEquals(0, Main.cycle(0, 0));   
        assertEquals(-6, Main.cycle(2, -3)); 
    }

    @Test
    void div() {
        assertEquals(18, Main.div(6, 3));     
        assertEquals(0, Main.div(0, 5));     
        assertEquals(10, Main.div(5, 2)); 
        assertEquals(-16, Main.div(8, -2)); 
    }
    @Test
    void arrs () {
        assertEquals(6, Main.arrs(2, 3));    
        assertEquals(0, Main.arrs(0, 0));    
        assertEquals(21, Main.arrs(7, 3));   
        assertEquals(-35, Main.arrs(5, -7));  
    }

    @Test
    void bigint () {
        assertEquals(1000000, Main.bigint(1000, 1000));  
        assertEquals(0, Main.bigint(0, 123456));         
        assertEquals(999999, Main.bigint(999, 1001));    
        assertEquals(-250000, Main.bigint(500, -500));   
    }

    @Test
    void bits () {
        assertEquals(15, Main.bits(5, 3));    
        assertEquals(-9, Main.bits(-3, 3));   
        assertEquals(4, Main.bits(-2, -2));  
        assertEquals(0, Main.bits(0, 0));
    }

    @Test
    void log(){
        assertEquals(25, Main.bits(-5, -5));
        assertEquals(81, Main.bits(9, 9));
        assertEquals(0, Main.bits(-2025, 0));
        assertEquals(3, Main.bits(3, 1));
    }
}