package com.dsag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    Queue<Integer> queue;

    @BeforeEach
    void setQueue() {
        queue = new Queue<>();
    }

    @Test
    public void isEmpty_NoElements_ReturnsTrue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void isEmpty_WithElements_ReturnsFalse() {
        queue.add(10);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void isEmpty_WithItemsRemoved_ReturnsTrue() {
        queue.add(6);
        Queue.Node node = queue.remove();
        assertEquals(node.getData(), 6);
    }

    @Test
    public void add_WithoutItems_ItemIsFirst() {
        queue.add(5);
        Queue.Node node = queue.peek();
        assertEquals(node.getData(), 5);
    }

    @Test
    public void add_WithManyItems_AppendsItemToEnd() {
        queue.add(1);
        queue.add(2);
        Queue.Node first = queue.peek();
        Queue.Node second = first.getNext();
        assertEquals(second.getData(), 2);
        assertNull(second.getNext());
    }

    @Test
    public void remove_WithOneItemInQueue_ReturnsItem() {
        queue.add(6);
        Queue.Node node = queue.remove();
        assertEquals(node.getData(), 6);
    }

    @Test
    public void remove_WithManyItemsInQueue_ResetsFirstItem() {
        queue.add(6);
        queue.add(5);
        queue.add(7);

        Queue.Node first = queue.remove();
        Queue.Node next = queue.remove();

        assertEquals(queue.peek().getData(), 7);
        assertFalse(queue.isEmpty());
        assertNull(queue.peek().getNext());
    }

    @Test
    public void remove_WithItems_SetsFirstItemNull() {
        queue.add(1);
        queue.add(2);

        queue.remove();
        queue.remove();

        assertTrue(queue.isEmpty());
    }
}
