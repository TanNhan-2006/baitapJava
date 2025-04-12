import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bai35 {
    public static class MyDate {
        private int year;
        private int month;
        private int day;

        public MyDate(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        // Các phương thức Getter và Setter giữ nguyên

        @Override
        public String toString() {
            String dateString = String.format("%04d-%02d-%02d", year, month, day);
            Date date = null;
            try {
                date = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
            } catch (ParseException ex) {
                Logger.getLogger(MyDate.class.getName()).log(Level.SEVERE, null, ex);
            }
            dateString = new SimpleDateFormat("EEEE d MMM yyyy", Locale.ENGLISH).format(date);
            return dateString;
        }

        public MyDate nextYear() {
            this.year++;
            return this;
        }

        public MyDate nextMonth() {
            if (this.month == 12) {
                this.month = 1;
                this.year++;
            } else {
                this.month++;
            }
            return this;
        }

        public MyDate nextDay() {
            Calendar cal = Calendar.getInstance();
            cal.set(year, month - 1, day);
            cal.add(Calendar.DAY_OF_MONTH, 1);
            this.year = cal.get(Calendar.YEAR);
            this.month = cal.get(Calendar.MONTH) + 1;
            this.day = cal.get(Calendar.DAY_OF_MONTH);
            return this;
        }

        public MyDate previousYear() {
            this.year--;
            return this;
        }

        public MyDate previousMonth() {
            if (this.month == 1) {
                this.month = 12;
                this.year--;
            } else {
                this.month--;
            }
            return this;
        }

        public MyDate previousDay() {
            Calendar cal = Calendar.getInstance();
            cal.set(year, month - 1, day);
            cal.add(Calendar.DAY_OF_MONTH, -1);
            this.year = cal.get(Calendar.YEAR);
            this.month = cal.get(Calendar.MONTH) + 1;
            this.day = cal.get(Calendar.DAY_OF_MONTH);
            return this;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        String dateString = String.format("%04d-%02d-%02d", year, month, day);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(dateString);
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        String[] weeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        String dateString = String.format("%04d-%02d-%02d", year, month, day);
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
        } catch (ParseException ex) {
            Logger.getLogger(MyDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        dateString = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
        int d = 0;
        for (String week : weeks) {
            if (week.equals(dateString)) break;
            d++;
        }
        return d;
    }

    public static void main(String[] args) {
        MyDate d1 = new MyDate(2012, 2, 28);
        System.out.println(d1);             // Tuesday 28 Feb 2012
        System.out.println(d1.nextDay());   // Wednesday 29 Feb 2012
        System.out.println(d1.nextDay());   // Thursday 1 Mar 2012
        System.out.println(d1.nextMonth()); // Sunday 1 Apr 2012
        System.out.println(d1.nextYear());  // Monday 1 Apr 2013

        MyDate d2 = new MyDate(2012, 1, 2);
        System.out.println(d2);                 // Monday 2 Jan 2012
        System.out.println(d2.previousDay());   // Sunday 1 Jan 2012
        System.out.println(d2.previousDay());   // Saturday 31 Dec 2011
        System.out.println(d2.previousMonth()); // Wednesday 30 Nov 2011
        System.out.println(d2.previousYear());  // Tuesday 30 Nov 2010

        MyDate d3 = new MyDate(2012, 2, 29);
        System.out.println(d3.previousYear());  // Monday 28 Feb 2011

        MyDate d4 = new MyDate(2099, 11, 31); // Invalid year, month, or day!
        MyDate d5 = new MyDate(2011, 2, 29);  // Invalid year, month, or day!
    }
}
