package usingLinkedList.singlyQueue;

public class MyQueue<E> {

    private Node<E> front = null;
    private Node<E> rear = null;
    private int size = 0;

    public void enqueue(E data) {
        if (front == null) {
            front = new Node<>(data);
            rear = front;
            size++;
        } else {
            rear.next = new Node<>(data);
            size++;
        }
    }

    public E dequeue() {
        E data = null;
        if (front != null) {
            data = front.data;
            front = front.next;
        }
        return data;
    }

    public int getSize() {
        return size;
    }

    private static class Node<E> {

        E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }
    }
}
