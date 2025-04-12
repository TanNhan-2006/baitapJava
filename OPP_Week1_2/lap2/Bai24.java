public class Bai24 {
    public static class Customer{
        private int id;
        private String name;
        private int discount;

        public Customer(int id,String name,int discount){
            this.id = id;
            this.name = name;
            this.discount = discount;
        }
        //Id 1
        public int getId(){
            return id;
        }
        //Name 1
        public String getName(){
            return name;
        }
        //Discount 2
        public int getDiscount(){
            return discount;
        }
        public void setDiscount(int id){
            this.discount = id;
        }
        @Override
        public String toString(){
            return name+"("+id+")("+discount+"%)";
        }
    }

    public static class Invoice{
        private int id;
        private Customer customer;
        private double amount;

        public Invoice(int id,Customer customer,double amount){
            this.id = id;
            this.customer = customer;
            this.amount = amount;
        }
        //Id
        public int getId(){
            return id;
        }
        //Customer 2
        public Customer getCustomer(){
            return customer;
        }
        public void setCustomer(Customer customer){
            this.customer = customer;
        }
        //Amount 2
        public double getAmount(){
            return amount;
        }
        public void setAmount(double amount){
            this.amount = amount;
        }
        //CustomerId
        public int getCustomerId(){
            return customer.getId();
        }
        //CustomerName
        public String getCustomerName(){
            return customer.getName();
        }
        //CustomerDiscount
        public int getCustomerDiscount(){
            return customer.getDiscount();
        }
        //AmountAfterDiscount
        public double getAmountAfterDiscount(){
            return amount - customer.getDiscount();
        }
        @Override
        public String toString(){
            return "Invoice [id=" + id + ", customer=" + customer + ", amount=" + amount + "]";
        }
    }

    public static void main(String[] args) {
        // Test Customer class
        Customer c1 = new Customer(88, "Tan Ah Teck", 10);
        System.out.println(c1);  // Customer's toString()

        c1.setDiscount(8);
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("discount is: " + c1.getDiscount());

        // Test Invoice class
        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println(inv1);

        inv1.setAmount(999.9);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("customer is: " + inv1.getCustomer());  // Customer's toString()
        System.out.println("amount is: " + inv1.getAmount());
        System.out.println("customer's id is: " + inv1.getCustomerId());
        System.out.println("customer's name is: " + inv1.getCustomerName());
        System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
        System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());
    }
}
