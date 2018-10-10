public class StackArray {
    public int size;
    public int[] array;
    public int top_element;

    public StackArray(int sz) {
        size = sz;
        array = new int[size];
        top_element = -1;
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(2);

    }

    public boolean isEmpty() {
        return (top_element == -1);
    }

    public void pushElement(int value) {
        int nextElement = ++top_element;
        array[nextElement] = value;
        System.out.println(top_element);
    }

    public int peekElement() {
        if (isEmpty()) {
            return 0;
        } else {
            return array[top_element];
        }
    }

    public int deleteElement() {
        if (isEmpty()) {
            return 0;
        } else {
            return array[top_element--];
        }
    }
}
