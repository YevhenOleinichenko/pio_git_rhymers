package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private int[] NUMBERS = new int[12];
    private final int ERROR_CODE = -1;
    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_CODE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_CODE;
        return NUMBERS[total--];
    }

}
