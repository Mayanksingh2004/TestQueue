package usingArray.linear;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(1);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.enqueue(1));
        System.out.println(myQueue.enqueue(2));
        System.out.println(myQueue.size());
    }
}
