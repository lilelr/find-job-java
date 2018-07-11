package chapter6.lambda;

/**
 * Created by yuxiao on 7/11/18.
 */
interface Eatable{
    void taste();
}

interface Flyable{
    void fly(String weather);
}

interface Addable{
    int add(int a, int b);
}


public class Lamba {

    public void eat(Eatable e){
        System.out.println(e);
        e.taste();
    }

    public void drive(Flyable f){
        System.out.println("我正在驾驶："+f);
        f.fly("【碧空如洗的晴日】");
    }

    // 调用该方法需要Addable对象
    public void test(Addable add)
    {
        System.out.println("5与3的和为：" + add.add(5, 3));
    }

    public static void main(String[] args){
        Lamba lq = new Lamba();
        lq.eat(()->System.out.println("It is nice to eat an apple"));
        lq.drive(weather -> {
            System.out.println("今天的天气是："+weather);
            System.out.println("直升机平稳驾驶");
        });

        lq.test((a,b)->a+b);
    }
}
