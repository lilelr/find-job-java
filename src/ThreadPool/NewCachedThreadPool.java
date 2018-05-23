package ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.*;

/**
 * Created by yuxiao on 5/23/18.
 */
public class NewCachedThreadPool {

    public static void main(String[] args){

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(index * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            cachedThreadPool.execute(new Runnable() {

                @Override
                public void run() {
                    System.out.println(index);
                }
            });
        }

//        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
//
//            @Override
//            public void run() {
//                System.out.println("delay 1 seconds, and excute every 3 seconds");
//            }
//        }, 1, 3, TimeUnit.SECONDS);


    }
}
