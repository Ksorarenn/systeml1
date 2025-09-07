import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void mainWithInvalidOperation() {
        String input = "5\n2\n99\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Main.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("Выберите операцию:"));
    }

    @Test
    void mainWithInputMismatch() {
        String input = "NaN\n2\n1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        assertDoesNotThrow(() -> Main.main(new String[]{}));

    }

    @Test
    void rec() {
        assertEquals(10, Main.rec(5, 2));
        assertEquals(0, Main.rec(0, 5));
        assertEquals(-6, Main.rec(2, -3));
        assertEquals(6, Main.rec(-2, -3));
        assertEquals(0, Main.rec(0, 0));
        assertEquals(5, Main.rec(1, 5));
        assertEquals(-5, Main.rec(-1, 5));
        assertEquals(-5, Main.rec(1, -5));
        assertEquals(5, Main.rec(-1, -5));
    }

    @Test
    void cycle() {
        assertEquals(10, Main.cycle(5, 2));
        assertEquals(0, Main.cycle(0, 5));
        assertEquals(-6, Main.cycle(2, -3));
        assertEquals(6, Main.cycle(-2, -3));
        assertEquals(0, Main.cycle(0, 0));
        assertEquals(5, Main.cycle(1, 5));
        assertEquals(-5, Main.cycle(-1, 5));
        assertEquals(-5, Main.cycle(1, -5));
        assertEquals(5, Main.cycle(-1, -5));
        assertEquals(1000000, Main.cycle(1000, 1000)); // цикл handle 1000*1000
    }

    @Test
    void div() {
        assertEquals(10, Main.div(5, 2));
        assertEquals(0, Main.div(0, 5));
        assertEquals(-6, Main.div(2, -3));
        assertEquals(6, Main.div(-2, -3));
        assertEquals(0, Main.div(0, 0));
        assertEquals(5, Main.div(1, 5));
        assertEquals(-5, Main.div(-1, 5));
        assertEquals(-5, Main.div(1, -5));
        assertEquals(5, Main.div(-1, -5));
    }
    @Test
    void arrs () {
        assertEquals(10, Main.arrs(5, 2));
        assertEquals(0, Main.arrs(0, 5));
        assertEquals(-6, Main.arrs(2, -3));
        assertEquals(6, Main.arrs(-2, -3));
        assertEquals(0, Main.arrs(0, 0));
        assertEquals(5, Main.arrs(1, 5));
        assertEquals(-5, Main.arrs(-1, 5));
        assertEquals(-5, Main.arrs(1, -5));
        assertEquals(5, Main.arrs(-1, -5));
    }

    @Test
    void bigint () {
        assertEquals(10, Main.bigint(5, 2));
        assertEquals(0, Main.bigint(0, 5));
        assertEquals(-6, Main.bigint(2, -3));
        assertEquals(6, Main.bigint(-2, -3));
        assertEquals(0, Main.bigint(0, 0));
        assertEquals(5, Main.bigint(1, 5));
        assertEquals(-5, Main.bigint(-1, 5));
        assertEquals(-5, Main.bigint(1, -5));
        assertEquals(5, Main.bigint(-1, -5));
        assertEquals(1000000, Main.bigint(1000, 1000));
    }

    @Test
    void bits () {
        assertEquals(10, Main.bits(5, 2));
        assertEquals(0, Main.bits(0, 5));
        assertEquals(-6, Main.bits(2, -3));
        assertEquals(6, Main.bits(-2, -3));
        assertEquals(0, Main.bits(0, 0));
        assertEquals(5, Main.bits(1, 5));
        assertEquals(-5, Main.bits(-1, 5));
        assertEquals(-5, Main.bits(1, -5));
        assertEquals(5, Main.bits(-1, -5));
        assertEquals(1000000, Main.bits(1000, 1000));
    }

    @Test
    void log(){
        assertEquals(10, Main.log(5, 2));
        assertEquals(0, Main.log(0, 5));
        assertEquals(-6, Main.log(2, -3));
        assertEquals(6, Main.log(-2, -3));
        assertEquals(0, Main.log(0, 0));
        assertEquals(5, Main.log(1, 5));
        assertEquals(-5, Main.log(-1, 5));
        assertEquals(-5, Main.log(1, -5));
        assertEquals(5, Main.log(-1, -5));
        assertEquals(1000000, Main.log(1000, 1000));
    }

}