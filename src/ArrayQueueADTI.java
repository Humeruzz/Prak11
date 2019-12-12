public interface ArrayQueueADTI {
    void enqueue(int num);
    int dequeue() throws Exception;
    int element() throws Exception;
    int size();
    boolean isEmpty();
    void clear();
}
