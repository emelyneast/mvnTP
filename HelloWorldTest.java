import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testGetMessage() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello, world!", helloWorld.getMessage());
    }
}
