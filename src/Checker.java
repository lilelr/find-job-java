/**
 * Created by yuxiao on 4/18/18.
 */
class Base{
    Base(){
        System.out.println("Base");
    }
}
public class Checker extends Base{

    Checker(){
        System.out.println("Checker");
       //  super(); // compile error
    }

    public static void main(String argv[]){
        Checker c = new Checker();
    }
}
