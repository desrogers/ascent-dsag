package com.dsag;

public class Stack<T> {
    static class Node<T> {
        private final T data;
        private Node<T> next;

        Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    private Node<T> last;

    public boolean isEmpty() {
        return last == null;
    }

    public Node<T> peek() {
        return last;
    }

    public Node<T> pop() {
        Node<T> currentNode = last;
        last = currentNode.getNext();
        currentNode.setNext(null);
        return currentNode;
    }

    public void push(T i) {
        if (last == null) {
            last = new Node<T>(i);
            return;
        }

        Node<T> currentNode = last;
        last = new Node<T>(i);
        last.setNext(currentNode);
    }
}
