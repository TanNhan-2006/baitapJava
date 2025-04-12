public class Bai16 {
    public static class Account {
        private String id;
        private String name;
        private int balance = 0;

        public Account(String id, String name) {
            this.id =id;
            this.name = name;
        }
        public Account(String id, String name, int balance){
            this.id = id;
            this.name = name;
            this.balance = balance;
        }
        public String getId(){
            return id;
        }
        public String getName(){
            return name;
        }
        public int getBalance(){
            return balance;
        }


        public int credit(int amount){
            return balance+=amount;
        }
        public void debit(int amount){
            if (amount <= balance){
                balance -= amount;
            } else {
                System.out.println("Amount exceeded balance");
            }
        }
        public int transferTo(Account you, int amount ){
            if (amount <= balance) {
                balance -= amount;
                you.credit(amount);
                return amount;
            } else {
                System.out.println("Amount exceeded balance");
            }
            return 0;
        }

        @Override
        public String toString() {
            return "Account [id="+id+",name= "+name+", balance="+balance+"]";
        }
    }
    public static void main(String[] args) {
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1);
        Account a2 = new Account("A102", "Kumar", 0);
        System.out.println(a2);
        System.out.println("id is: "+a1.getId());
        System.out.println("name is: "+a1.getName());
        System.out.println("balance is: "+a1.getBalance());

        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);  // debit() error
        System.out.println(a1);

        a1.transferTo(a2, 100);  // toString()
        System.out.println(a1);
        System.out.println(a2);
    }
}
