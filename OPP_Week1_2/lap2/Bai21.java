public class Bai21 {
    public static class Author{
        private String name;
        private String email;
        private char gender;

        //Author
        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }
        //Name
        public String getName() {
            return name;
        }
        //Email
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        //Gender
        public char getGender() {
            return gender;
        }
        @Override
        public String toString() {
            return "Author[name="+name+",email="+email+",gender="+gender+"]";
        }
    }
    public static class Book{
        private String name;
        private Author author;
        private double price;
        private int qty=0;

        public Book(String name,Author author,double price){
            this.name = name;
            this.author = author;
            this.price = price;
        }
        public Book(String name,Author author,double price,int qty){
            this.name = name;
            this.author = author;
            this.price = price;
            this.qty = qty;
        }
        //Name
        public String getName() {
            return name;
        }
        //Author
        public Author getAuthor() {
            return author;
        }
        //Price
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        //Qty
        public int getQty() {
            return qty;
        }
        public void setQty(int qty) {
            this.qty = qty;
        }
        @Override
        public String toString() {
            return "Book[name="+name+",Author[name="+author.name+",email="+ author.email+",gender="+author.gender+",qty="+qty+"]";
        }
    }
    public static void main(String[] args){

        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);

        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);
    }
}
