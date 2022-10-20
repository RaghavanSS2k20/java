public class Producer implements Runnable{
    private SyncStack stack;
    private int Num;
    private static int cnt=1;

    public Producer(SyncStack stack) {
        this.stack = stack;
        Num = cnt++;
    }
    public void run(){
        char c;
        for(int i=0;i<500;i++){
            c= (char)(Math.random()*26+'A');
            stack.push(c);
                System.out.println(" p "+Num+": "+c);
                try {
                    Thread.sleep((int)(Math.random()*300));
                }
                catch(InterruptedException e){

            }
        }
    }

}
