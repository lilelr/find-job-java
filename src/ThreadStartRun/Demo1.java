package ThreadStartRun;

/**
 * Created by yuxiao on 5/23/18.
 */
public class Demo1 {

    public static void main(String args[]){
        Thread t = new Thread(){
            public void run(){
                    pong();
            }
        };
        t.start();
        System.out.print("ping");
    }

    static void pong(){
        System.out.print("pong");
    }
}
