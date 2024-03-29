/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javainterview.question1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Question1_FibonacciTest {

    private Question1_Fibonacci underTest = new Question1_Fibonacci();

    @Test public void testFirstTerm() {
        assertEquals("1st term should be 1", Integer.valueOf(1), underTest.getNthFibonacciTerm(1));
    }
    @Test public void testSecondTerm() {
        assertEquals("2nd term should be 1", Integer.valueOf(1), underTest.getNthFibonacciTerm(2));
    }
    @Test public void testThirdTerm() {
        assertEquals("3rd term should be 2", Integer.valueOf(2), underTest.getNthFibonacciTerm(3));
    }
    @Test public void testSixthTerm() {
        assertEquals("6th term should be 8", Integer.valueOf(8), underTest.getNthFibonacciTerm(6));
    }

    //add any additional tests you feel are appropriate
}
