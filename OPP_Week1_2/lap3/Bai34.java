import java.util.logging.Level;
import java.util.logging.Logger;

public class Bai34 {
    public class MyTime {
        private int hour;
        private int minute;
        private int second;

        public MyTime(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        public int getHour() {
            return hour;
        }

        public void setHour(int hour) {
            this.hour = hour;
        }

        public int getMinute() {
            return minute;
        }

        public void setMinute(int minute) {
            this.minute = minute;
        }

        public int getSecond() {
            return second;
        }

        public void setSecond(int second) {
            this.second = second;
        }

        public void setTime(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        @Override
        public String toString() {
            return String.format("%02d:%02d:%02d", hour, minute, second);
        }

        public MyTime nextHour() {
            this.hour = (this.hour + 1) % 24;
            return this;
        }

        public MyTime nextMinute() {
            this.minute = (this.minute + 1) % 60;
            return this;
        }

        public MyTime nextSecond() {
            this.second = (this.second + 1) % 60;
            return this;
        }

        public MyTime previousHour() {
            this.hour = (this.hour - 1 + 24) % 24;
            return this;
        }

        public MyTime previousMinute() {
            this.minute = (this.minute - 1 + 60) % 60;
            return this;
        }

        public MyTime previousSecond() {
            this.second = (this.second - 1 + 60) % 60;
            return this;
        }
    }

    public static void main(String[] args) {
        Bai34 outer = new Bai34();
        MyTime myTime = outer.new MyTime(23, 59, 59);
        System.out.println(myTime);
        myTime.nextHour();
        System.out.println(myTime);
        myTime.nextSecond();
        System.out.println(myTime);
    }
}
