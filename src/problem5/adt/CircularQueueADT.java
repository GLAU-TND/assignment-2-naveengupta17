package problem5.adt;

public interface CircularQueueADT<E> {
    public void enqueue(E data);

    //a method to remove element from front of queue
    public E dequeue();

    //a method to get front element of queue
    public E peek();

    // a method to check whether queue is empty
    public boolean isEmpty();

    // to get size of queue
    public int getSize();

}
