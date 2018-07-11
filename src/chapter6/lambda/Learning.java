package chapter6.lambda;

/**
 * Created by yuxiao on 7/5/18.
 */
public class Learning {
    public static void main(String[] args){
        Runnable r = ()->{
            for (int i=0;i<100;i++){
                System.out.println();
            }
        };

    }
}
