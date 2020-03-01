package usingLinkedList.doublyQueue;

public interface DoublyEndedQueueADT<E> {

    boolean enqueueFront(E element);

    boolean enqueueRear(E element);

    E dequeueFront();

    E dequeueRear();

    E peekFront();

    E peekRear();

    int size();

    boolean isEmpty();
}
