public class Main {

    public static void main(String[] args) {
       // ArrayQueueModule temp = new ArrayQueueModule();
       // temp.showQueue();
        ArrayQueueADTI temp = new ArrayQueueADT(10);
        temp.enqueue(10);
        ArrayQueue temp1 = new ArrayQueue(10);
        temp1.enqueue(5);
        try {
            System.out.println(temp.element());
            System.out.println(temp1.element());
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
