public class Queue {
    private int[] array   ;
    private int first, last;
    private int size;

    public Queue(int num) {
        array = new int[num];
        size = num;
        last = -1;
        first = -1;
    }

    public void enqueue(int num) {
        if (last + 1 != first){
            if (last == -1) last = 0;
            array[last] = num;
            if (first == -1) first = 0;
            if (last + 1 == size){
                if (first != 0) {
                    last = 0;
                }
            } else{
                last++;
            }
        }

    }

    public int dequeue() throws Exception {
        if((last != -1)&&(first != -1)){
            int temp = array[first];
            array[first] = 0;
            if(first == last){
                first = last = -1;
            } else if(first + 1 == size) {
                first = 0;
            } else{
                first++;
            }
            return temp;
        }
        throw new Exception("Empty Queue");
    }

    public int element() throws Exception {
        if((last != -1)&&(first != -1)) {
            return array[first];
        }
        throw new Exception("Empty Queue");
    }

    public int size() {
        if((last != -1)&&(first != -1)) {
            if (last != first){
                int temp = (size-first)+(last+1);
                return temp;
            } else{
                return 1;
            }
        } else {
            return 0;
        }
    }

    public boolean isEmpty() {
        if((last == -1)&&(first == -1)){
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        first = last = -1;
        array = new int[size];
    }
}
