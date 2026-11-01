import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    @Test
    void testAddition() {
        int actual = Hello.add(2, 3);

        assertEquals(5, actual);
    }

  @Test
void intentionalFailureTest() {
    assertEquals(5, 5);
}
}
