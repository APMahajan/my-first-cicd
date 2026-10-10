import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloTest {

    @Test
    void testAddition() {
        int actual = Hello.add(2, 3);

        assertEquals(5, actual);
    }

    @Test
    void testAdditionWithZero() {
        int actual = Hello.add(5, 0);

        assertEquals(5, actual);
    }
}
