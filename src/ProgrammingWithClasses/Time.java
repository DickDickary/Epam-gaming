package ProgrammingWithClasses;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time {
    GregorianCalendar gregorianCalendar = new GregorianCalendar();


    public void getCalendar(){
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar.getTime());
    }
    public void changeSec(int i){
        gregorianCalendar.set(Calendar.SECOND,i);
    }
    public void changeMinute(int i){
        gregorianCalendar.set(Calendar.MINUTE,i);
    }
    public void changeHour(int i){
        gregorianCalendar.set(Calendar.HOUR,i);
    }
    public void plusHour(int i){
        gregorianCalendar.add(Calendar.HOUR,i);
    }
    public void plusMin(int i){
        gregorianCalendar.add(Calendar.MINUTE,i);
    }
    public void plusSec(int i){
        gregorianCalendar.add(Calendar.SECOND,i);
    }

}
