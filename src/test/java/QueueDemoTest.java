import org.junit.Test;

import java.util.NoSuchElementException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class QueueDemoTest {
    @Test
    public void testQueueIsEmpty() {
        QueueDemo queue = new QueueDemo(2);

        assertTrue(queue.isEmpty());

    }

    @Test
    public void testQueueCanEnqueue() {
        QueueDemo queue = new QueueDemo(3);
        int numberOfPushedElements = 2;
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(queue.size(), numberOfPushedElements);

    }

    @Test
    public void testQueueCanDequeue() {
        QueueDemo queue = new QueueDemo(3);
        int numberOfElementsLeft = 1;
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        queue.dequeue();

        assertEquals(queue.size(), numberOfElementsLeft);
    }

    @Test(expected = IllegalStateException.class)
    public void testQueueIsOverflown() {
        QueueDemo queue = new QueueDemo(2);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
    }

    @Test(expected = NoSuchElementException.class)
    public void testQueueuIsUnderflown() {
        QueueDemo queue = new QueueDemo(1);
        queue.dequeue();
        queue.dequeue();
    }
}
