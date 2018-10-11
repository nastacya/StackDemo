public class StackArray {
    private int size;
    private int[] array;
    private int top_element;

    StackArray(int sz) {
        size = sz;
        array = new int[size];
        top_element = -1;
    }

    public boolean isEmpty() {
        return (top_element == -1);
    }

    public void pushElement(int value) {
        int nextElement = ++top_element;
        array[nextElement] = value;
    }

    public int peekElement() {
        if (isEmpty()) {
            return Integer.parseInt(null);
        } else {
            return array[top_element];
        }
    }

    public int popElement() {
        if (isEmpty()) {
            return Integer.parseInt(null);
        } else {
            return array[top_element--];
        }
    }

    public int arraySize() {
        if (size < 0) {
            throw new NegativeArraySizeException();
        }
        return size;
    }
}
