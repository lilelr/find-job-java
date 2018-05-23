import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuxiao on 5/22/18.
 * Java 泛型擦除
 */
public class WipeOut {

//    public void listMethod(List<String> stringList){
//    }
//    public void listMethod(List<Integer> intList) {
//    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<String> ls = new ArrayList<String>();
        List<Integer> li = new ArrayList<Integer>();
        System.out.println(ls.getClass() == li.getClass());
    }

    public void inspect(List<Object> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
        list.add(1); //这个操作在当前方法的上下文是合法的。
    }
    public void inspect2(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
      //  list.add(1); //编译错误,编译器无法知道具体的类型是什么
    }
    public void test() {
        List<String> strs = new ArrayList<String>();
//        inspect(strs); //编译错误
    }

    class ClassTest<X extends Number, Y, Z> {
        private X x;
//        private static Y y; //编译错误，不能用在静态变量中
        public X getFirst() {
            //正确用法
            return x;
        }
//        public void wrong() {
//            Z z = new Z(); //编译错误，不能创建对象
//        }
    }
}
