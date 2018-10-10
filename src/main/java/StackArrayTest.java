import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class StackArrayTest {

    @Test
    public void stackArrayIsEmpty() {
        StackArray stack = new StackArray(2);

        assertTrue(stack.isEmpty());

    }

    @Test
    public void stackArrayIsNotEmpty() {
        StackArray stack = new StackArray(2);
        stack.pushElement(1);

        assertFalse(stack.isEmpty());
    }

    @Test
    public void stackArrayCanBePushedWithElements() {
        StackArray stack = new StackArray(3);
        stack.pushElement(0);
        stack.pushElement(2);
        stack.pushElement(5);

        assertEquals(3, stack.size);
    }

    @Test
    public void stackArrayCanDeleteElements() {

    }

    @Test
    public void stackArrayCanPeekElements() {
        StackArray stack = new StackArray(2);
    }

}