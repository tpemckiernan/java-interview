/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javainterview;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldAppTest {
    @Test public void testHelloWorld() {
        HelloWorldApp classUnderTest = new HelloWorldApp();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
