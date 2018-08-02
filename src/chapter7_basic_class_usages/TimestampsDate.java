package chapter7_basic_class_usages;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by yuxiao on 8/2/18.
 */
public class TimestampsDate {
    public static void main(String[] args){
        Date date = new Date();

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));

        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        LocalDateTime endTimeOfToday= LocalDateTime.of(localDateTime.getYear(),localDateTime.getMonth(),localDateTime.getDayOfMonth(),23,59,59);

        LocalTime localTime = localDateTime.toLocalTime();
        int currentSeconds = localTime.toSecondOfDay();
        int currentHours = localTime.getHour();
        System.out.println(currentSeconds);
        System.out.println(currentHours);


    }
}
