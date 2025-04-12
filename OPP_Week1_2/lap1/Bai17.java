public class Bai17 {
    public static class Date{
        private int day;
        private int month;
        private int year;
        // Date
        public Date(int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }
        public void setData(int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }
        // Day
        public int getDay(){
            return day;
        }
        public void setDay(int day){
            this.day = day;
        }
        // Month
        public int getMonth(){
            return month;
        }
        public void setMonth(int month){
            this.month = month;
        }
        // Year
        public int getYear(){
            return year;
        }
        public void setYear(int year){
            this.year = year;
        }

        @Override
        public String toString(){
            return day+"/"+month+"/"+year;
        }
    }
    public static void main(String[] args) {
        Date d1 = new Date(1, 2, 2014);
        System.out.println(d1);

        d1.setMonth(12);
        d1.setDay(9);
        d1.setYear(2099);
        System.out.println(d1);
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Day: " + d1.getDay());
        System.out.println("Year: " + d1.getYear());

        d1.setData(3, 4, 2016);
        System.out.println(d1);  // toString()
    }
}
