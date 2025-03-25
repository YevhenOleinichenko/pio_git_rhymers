package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private final int[] NUMBERS = new int[12];
    private final int ERROR_CODE = -1;
    private int total = -1;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull()) {
            total++;
            NUMBERS[getTotal()] = in;
        }
    }

    public boolean callCheck() {
        return getTotal() == -1;
    }

    public boolean isFull() {
        return getTotal() == 11;
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
