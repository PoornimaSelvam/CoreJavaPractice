package com.basic.test;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack
{
    private Object[] elements;
    /**
     * @return the elements
     */
    public Object[] getElements()
    {
        return elements;
    }

    /**
     * @param elements the elements to set
     */
    public void setElements(Object[] elements)
    {
        this.elements = elements;
    }

    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack()
    {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e)
    {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop()
    {
        if (size == 0)
            throw new EmptyStackException();
        return elements[--size];
    }

    /**
     * Ensure space for at least one more element, roughly doubling the capacity
     * each time the array needs to grow.
     */
    private void ensureCapacity()
    {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}