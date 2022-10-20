public class Main {
    public static void main(String[] args) {

        SyncStack stack = new SyncStack();
        Producer p1 = new Producer(stack);
        Thread P1 = new Thread(p1);
        P1.start();

        Producer p2 = new Producer(stack);
        Thread P2 = new Thread(p2);
        P2.start();




        Consumer c1 = new Consumer(stack);
        Thread C1 = new Thread(c1);
        C1.start();

        Consumer c2 = new Consumer(stack);
        Thread C2 = new Thread(c2);
        C2.start();


    }
}