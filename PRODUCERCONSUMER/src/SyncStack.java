import java.util.ArrayList;
import java.util.List;

public class SyncStack {
    private List<Character> buffer = new ArrayList<Character>(1000);
    public synchronized void push(char c){
        this.notify();
        buffer.add(c);
    }

    public synchronized char pop(){
        while(buffer.size() == 0){
            try{
                this.wait();
            }
            catch (InterruptedException e){

            }

        }
        return buffer.remove(buffer.size()-1);
    }
}
