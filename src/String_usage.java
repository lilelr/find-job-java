/**
 * Created by yuxiao on 4/18/18.
 */
public class String_usage {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));

        s3 = s3.intern();
        System.out.println(s2 == s3);
    }
}
