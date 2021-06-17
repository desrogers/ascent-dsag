package com.dsag;

public class Queue<Item> {

    static class Node<Item> {
        private Item data;
        private Node<Item> next;

        public Item getData() {
            return data;
        }

        public Node<Item> getNext() {
            return next;
        }

        public Node(Item data) {
            this.data = data;
        }

        public void setNext(Node<Item> itemNode) {
            this.next = itemNode;
        }
    }

    private Node<Item> first;

    public boolean isEmpty() {
        return first == null;
    }

    public void add(Item i) {
        if (this.isEmpty()) {
            first = new Node<>(i);
        } else {
            Node currentNode = first;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new Node<>(i));
        }
    }

    public Node remove() {
        Node currentNode = first;
        if (currentNode.getNext() == null) {
            first = null;
        } else {
            first = first.getNext();
        };

        return currentNode;
    }

    public Node<Item> peek() {
        return first;
    }
}
