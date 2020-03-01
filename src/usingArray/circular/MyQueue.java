package usingArray.circular;

public class MyQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public MyQueue(int sizeOfArray) {
        queue = new int[sizeOfArray];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        boolean response = false;
        if (size == 0) {
            response = true;
        }
        return response;
    }

    public boolean enqueue(int element) {
        boolean response = false;
        if (size != queue.length) {
            rear = Math.abs((++rear) % queue.length);
            response = true;
            queue[rear] = element;
            size++;
        }
        return response;
    }

    public int dequeue() {
        int response = 0;
        if (!isEmpty()) {
            response = queue[front];
            front = Math.abs(++front % queue.length);
            size--;
        }
        return response;
    }
}
