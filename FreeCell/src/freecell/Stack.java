package freecell;

import java.util.NoSuchElementException;

public class Stack {
	private PlayingCard[] array;
    private int size = 0;

    public Stack(int capacity) {
        array = new PlayingCard[capacity];
    }

    public void push(PlayingCard card) {
        if (size == array.length) {
            throw new IllegalStateException("Cannot add to full stack");
        }
        array[size++] = card;
    }

    public PlayingCard pop() {
        if (size == 0) {
            throw new NoSuchElementException("Cannot pop from empty stack");
        }
        PlayingCard result = array[size-1];
        array[--size] = null;
        return result;
    }

    public PlayingCard peek() {
        if (size == 0) {
            throw new NoSuchElementException("Cannot peek into empty stack");
        }
        return array[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

	public int size() {
        return size;
    }
}
