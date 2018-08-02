package functionjava8;

import java.util.Date;
import java.util.function.Supplier;

/**
 * Created by yuxiao on 7/20/18.
 */
public class SupplierFunctionExample {

    public static void main(String args[]){

        Supplier<String> helloStrSupplier = ()-> new String("Hello");

        String helloStr = helloStrSupplier.get();

        System.out.println("String in hello Str is ->" + helloStr + "<-");

        Supplier<String> emptySUpplier = String::new;
        String emptyStr = emptySUpplier.get();
        System.out.println("String in emptyStr is->" + emptyStr + "<-");

        Supplier<Date> dateSupplier = SupplierFunctionExample::getSystemDate;
        Date systemDate = dateSupplier.get();
        System.out.println("SystemSate->" + systemDate);
    }

    public static Date getSystemDate(){
        return new Date();
    }

}
