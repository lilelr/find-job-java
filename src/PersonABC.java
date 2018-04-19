/**
 * Created by yuxiao on 4/18/18.
 */

abstract class Person{
    public abstract void sayHello();

    public void about(){
        System.out.println("Abstract Demo");
    }


}

class Student extends Person{
    public void sayHello(){
        System.out.println("SayHello");
    }
}

//class Nurse extends Person{ // compile error
//
//}


abstract class Pupil extends Person{
    public void sayHello(){
        System.out.println("sayHello");
    }
}
abstract class  Worker extends Person{

}
public class PersonABC {
}
