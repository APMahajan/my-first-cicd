public class HelloTest {
    public static void main(String[] args) {
        if (Hello.add(2, 3) != 5) {
            throw new AssertionError("Addition test failed");
        }

        System.out.println("All tests passed!");
    }
}