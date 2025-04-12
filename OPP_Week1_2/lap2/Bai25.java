public class Bai25 {
    public static class Customer {
        private int id;
        private String name;
        private char gender;
        private int discount;

        public Customer(int id, String name, char gender, int discount) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.discount = discount;
        }
        //Id
        public int getId() {
            return id;
        }
        //Name
        public String getName() {
            return name;
        }
        //Gender
        public char getGender() {
            return gender;
        }
        //Discount
        public int getDiscount() {
            return discount;
        }
        public void setDiscount(int discount) {
            this.discount = discount;
        }
        @Override
        public String toString() {
            return name + "(" + id + ")";
        }
    }

    public static class Account {
        private int id;
        private Customer customer;
        private double balance = 0.0;

        public Account(int id, Customer customer, double balance) {
            this.id = id;
            this.customer = customer;
            this.balance = balance;
        }

        public Account(int id, Customer customer) {
            this.id = id;
            this.customer = customer;
        }
        //Id
        public int getId() {
            return id;
        }
        //Customer
        public Customer getCustomer() {
            return customer;
        }
        //Balance
        public double getBalance() {
            return balance;
        }
        public void setBalance(double balance) {
            this.balance = balance;
        }
        @Override
        public String toString() {
            return "Account[id=" + id + ", customer=" + customer.toString() + ", balance=" + balance + "]";
        }
        public String getCustomerName() {
            return customer.getName();
        }
        public Account deposit(double amount) {
            balance += amount;
            return this;
        }
        public Account withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Số dư không đủ.");
            }
            return this;
        }
    }

    public static void main(String[] args) {
        // Tạo một đối tượng Customer và kiểm tra các phương thức
        Customer c1 = new Customer(1, "Nguyen Van A", 'm', 15);
        System.out.println(c1);

        c1.setDiscount(20);
        System.out.println(c1);
        System.out.println("ID: " + c1.getId());
        System.out.println("Name: " + c1.getName());
        System.out.println("Gender: " + c1.getGender());
        System.out.println("Discount: " + c1.getDiscount());

        // Tạo một đối tượng Account và kiểm tra các phương thức
        Account a1 = new Account(1, c1, 1000.0);
        System.out.println(a1);

        a1.deposit(500.0);
        System.out.println("After deposit: " + a1.getBalance());

        a1.withdraw(300.0);
        System.out.println("After withdraw: " + a1.getBalance());

        a1.withdraw(1500.0);
    }
}
