public class StackArray {
    private Integer[] array;
    private Integer top;

    StackArray(int sz) {
        if (sz < 0) {
            throw new NegativeArraySizeException();
        }

        array = new Integer[sz];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void pushElement(int value) {
        ++top;
        if (top > array.length - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        array[top] = value;
    }

    public Integer popElement() {
        int start = 0;

        if (top < start) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int e = array[top];
        top--;
        return e;
    }

    public Integer arrayLength() {
        return array.length;
    }

}
