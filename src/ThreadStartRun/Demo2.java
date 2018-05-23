package ThreadStartRun;

/**
 * Created by yuxiao on 5/23/18.
 */
public class Demo2 {
    public static void main(String args[]) {
        Thread t = new Thread() {
            public void run() {
                pong();
            }
        };
        //       t.start();
        t.run();
        System.out.print("ping");
    }
    static void pong() {
        System.out.print("pong");
    }
}
