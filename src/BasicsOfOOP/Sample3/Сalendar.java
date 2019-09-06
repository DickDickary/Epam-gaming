package BasicsOfOOP.Sample3;

import java.util.GregorianCalendar;

public class Сalendar {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(2,3,4);

        Weekends weekends = new Weekends(gregorianCalendar,true);

    }

    static class Weekends{

       GregorianCalendar calendar;
        boolean isHoliday;
        public Weekends(GregorianCalendar calendar, Boolean isHoliday) {
            this.calendar = calendar;
            this.isHoliday = isHoliday;
        }



    }
}
