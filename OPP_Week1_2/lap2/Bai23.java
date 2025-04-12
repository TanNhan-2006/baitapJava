public class Bai23 {
    public static class Author {
        private String name;
        private String email;

        public Author(String name,String email) {
            this.name = name;
            this.email = email;
        }
        //Name
        public String getName() {
            return name;
        }
        //Email
        public String getEmail() {
            return email;
        }
        public void setEmail(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return "Author [name=" + name + ", email=" + email + "]";
        }
    }
    public static class Book {
        private String isbn;
        private String name;
        private Author author;
        private double price;
        private int qty;

        public Book(String isbn,String name,Author author,double price) {
            this.isbn = isbn;
            this.name = name;
            this.author = author;
            this.price = price;
        }
        public Book(String isbn,String name,Author author,double price,int qty) {
            this.isbn = isbn;
            this.name = name;
            this.author = author;
            this.price = price;
            this.qty = qty;
        }
        //Isbn
        public String getIsbn() {
            return isbn;
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
        //AuthorName
        public String getAuthorName() {
            return author.getName();
        }
        @Override
        public String toString() {
            return "Book[isbn="+isbn+",Author[name="+author.name+",email="+author.email+"],price="+price+",qty="+qty+"]";
        }
    }
    public static void main(String[] args) {
        // Test Author class
        Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(a1);

        a1.setEmail("ahteck@somewhere.com");
        System.out.println(a1);
        System.out.println("name is: " + a1.getName());
        System.out.println("email is: " + a1.getEmail());

        // Test Book class
        Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
        System.out.println(b1);

        b1.setPrice(9.9);
        b1.setQty(99);
        System.out.println(b1);
        System.out.println("isbn is: " + b1.getIsbn());
        System.out.println("name is: " + b1.getName());
        System.out.println("price is: " + b1.getPrice());
        System.out.println("qty is: " + b1.getQty());
        System.out.println("author is: " + b1.getAuthor());  // Author's toString()
        System.out.println("author's name: " + b1.getAuthorName());
        System.out.println("author's name: " + b1.getAuthor().getName());
        System.out.println("author's email: " + b1.getAuthor().getEmail());
    }
}