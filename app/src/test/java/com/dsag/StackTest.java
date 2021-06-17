package com.dsag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack<Integer> stack;

    @BeforeEach
    public void setStack() {
        stack = new Stack<>();
    }

    @Test
    public void isEmpty_WithoutElementsInStack_ReturnsTrue() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void peek_WithItemInStack_ReturnsLastAddedObject() {
        stack.push(1);
        assertEquals(stack.peek().getData(), 1);
    }

    @Test
    public void push_AddsItemToStack() {
        stack.push(1);
        assertNotNull(stack.peek());
    }

    @Test
    public void push_AddItemsToStack_TopItemIsLastAddedItem() {
        stack.push(1);
        stack.push(2);
        assertEquals(stack.peek().getData(), 2);
    }

    @Test
    public void push_AddItems_SecondToLastItemIsNext() {
        stack.push(1);
        stack.push(2);
        assertEquals(stack.peek().getNext().getData(), 1);
    }

    @Test
    public void pop_WithItems_RemovesLastAddedItemAndReturnsItem() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int actual = stack.pop().getData();
        assertEquals(3, actual);
        assertEquals(2, stack.peek().getData());
    }
}
