public class Bai18 {
    public static class Time {
        private int hour;
        private int minute;
        private int second;

        // Time
        public Time(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        public void setTime(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        // Hour
        public int getHour() {
            return hour;
        }
        public void setHour(int hour) {
            this.hour = hour;
        }
        // Minute
        public int getMinute() {
            return minute;
        }
        public void setMinute(int minute) {
            this.minute = minute;
        }
        // Second
        public int getSecond() {
            return second;
        }
        public void setSecond(int second) {
            this.second = second;
        }
        @Override
        public String toString() {
            return hour + " : " + minute + " : " + second;
        }

        public Time nextSecond() {
            ++second;
            if (second == 60) {
                second = 0;
                ++minute;
                if (minute == 60) {
                    minute = 0;
                    ++hour;
                    if (hour == 24) {
                        hour = 0;
                    }
                }
            }
            return this;
        }
        public Time previousSecond() {
            second--;
            if (second == -1) {
                second = 59;
                minute--;
                if (minute == -1) {
                    minute = 59;
                    hour--;
                    if (hour == -1) {
                        hour = 23;
                    }
                }
            }
            return this;
        }
    }
    public static void main(String[] args) {
        // Test constructors and toString()
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1);  // toString()

        // Test Setters and Getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);  // toString()
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

        // Test setTime()
        t1.setTime(23, 59, 58);
        System.out.println(t1);  // toString()

        // Test nextSecond();
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond());

        // Test previousSecond()
        System.out.println(t1.previousSecond());
        System.out.println(t1.previousSecond().previousSecond());
    }
}
