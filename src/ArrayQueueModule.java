public class ArrayQueueModule {
    private int size = 10;
    private int num = 6;
    private int[] array;
    private int last, first;

    public ArrayQueueModule() {
        last = -1;
        first = 0;
        array = new int[size];
        if (num <= size) {
            for (int i = 0; i < num; i++){
             //   if ((first + 1 != last)||(first-1 != last)) {
                    array[i] = (int) (Math.random() * 9)+1;
                    //if (first+1 == size){
                   //     if (last != 0){
                   //         first = 0;
                   //     }
                       // throw new Exception("Queue overFlow");
                  //  } else {
                        last++;
                   // }
               // }
            }
        } else {
            System.out.println("Out of Queue");
            array = null;
        }
    }

    public void showQueue() {
        if (array != null) {
            int i = first;
            System.out.println(last + " " + first);
            while (i != last) {
                System.out.println(array[i] + " ");
                if (i + 1 == size) {
                    i = 0;
                } else {
                    i++;
                }
            }
            System.out.println(array[i] + " ");
        } else {
            System.out.println("Out of Queue");
        }
    }
}
