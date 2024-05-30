package Challenge100;

import java.util.concurrent.ThreadPoolExecutor;

public class ThreadState extends Thread {


    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.printf("From inside run %s", Thread.currentThread().getState());

        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
