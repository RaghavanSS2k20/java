public class Consumer implements Runnable{
    private SyncStack stack;
    private int Num;
    private static int cnt=1;

    public Consumer(SyncStack stack) {
        this.stack = stack;
        Num = cnt++;
    }
    public void run(){
        char c;
        for(int i=0;i<500;i++){
            c = stack.pop();
            System.out.println("C "+Num+" : "+c);
            try{
                Thread.sleep((int)(Math.random()*300));


            }
            catch (InterruptedException e){

            }

        }

    }
}
