package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final boolean IF_EMPTY = false;
	private static final int ERROR_CODE = -1;
	Node last;
    int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return IF_EMPTY;
    }

    public int top() {
        if (isEmpty())
            return ERROR_CODE;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return ERROR_CODE;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
