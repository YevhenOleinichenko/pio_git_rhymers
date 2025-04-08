package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	private static final int CAPACITY = 12;
	private static final int MAX_INDEX = CAPACITY - 1;
	private static final int EMPTY = -1;
	private final int[] NUMBERS = new int[CAPACITY];
	final int ERROR_CODE = -1;
	private int total = EMPTY;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[setTotal(getTotal() + 1)] = in;
	}

	public boolean callCheck() {
		return getTotal() == EMPTY;
	}

	public boolean isFull() {
		return getTotal() == MAX_INDEX;
	}

	protected int peekaboo() {
		if (callCheck())
			return ERROR_CODE;
		return NUMBERS[getTotal()];
	}

	public int countOut() {
		if (callCheck())
			return ERROR_CODE;
		return NUMBERS[setTotal(getTotal() - 1)];
	}

	public int getTotal() {
		return total;
	}

	public int setTotal(int total) {
		this.total = total;
		return total;
	}

}
