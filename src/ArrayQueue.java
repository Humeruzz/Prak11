public class ArrayQueue {
    private Queue array;

    public ArrayQueue(int num) {
        this.array = new Queue(num);
    }

    public void enqueue(int num) {
        array.enqueue(num);
    }

    public int dequeue() throws Exception {
        try {
            int temp = array.dequeue();
            return temp;
        } catch (Exception e){
            throw e;
        }
    }

    public int element() throws Exception {
        try {
            int temp = array.element();
            return temp;
        } catch (Exception e){
            throw e;
        }
    }

    public int size() {
        return array.size();
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    public void clear() {
        array.clear();
    }
}
