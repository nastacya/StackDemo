import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class StackArrayTest {

    @Test
    public void testStackArrayIsEmpty() {
        StackArray stack = new StackArray(2);

        assertTrue(stack.isEmpty());

    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testStackArrayIsNotOverflown() {
        StackArray stack = new StackArray(2);

        stack.pushElement(1);
        stack.pushElement(1);
        stack.pushElement(1);
        stack.pushElement(1);
        stack.pushElement(1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testStackArrayPop() {
        StackArray stack = new StackArray(2);

        stack.pushElement(1);
        stack.pushElement(1);

        stack.popElement();
        stack.popElement();
        stack.popElement();
        stack.popElement();
    }

    @Test
    public void testStackWorks() {
        StackArray stack = new StackArray(3);
        stack.pushElement(10);
        stack.pushElement(24);
        stack.pushElement(3);
        stack.popElement();
        int output = stack.popElement();
        int expected = 2;

        assertEquals(expected, output);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void testNegativeArraySizeException() {
        StackArray stack = new StackArray(-2);
        Object o = stack.arrayLength();
    }
}