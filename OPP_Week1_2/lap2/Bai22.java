import java.util.Arrays;

public class Bai22 {
    public static class Book{
        private String name;
        private Bai21.Author[] author;
        private double price;
        private int qty=0;

        public Book(String name, Bai21.Author[] author, double price) {
            this.name = name;
            this.author = author;
            this.price = price;
        }
        public Book(String name, Bai21.Author[] author, double price, int qty) {
            this.name = name;
            this.author = author;
            this.price = price;
            this.qty = qty;
        }
        //Name
        public String getName() {
            return name;
        }
        //Authors
        public Bai21.Author[] getAuthors() {
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
            return "Book[name="+name+", authors={"+ Arrays.toString(author)+"},price="+price+"qty="+qty+"]";
        }
        public String getAuthorName(){
            return author[0].getName()+" "
                    +author[1].getEmail();
        }
    }
    public static void main(String[] args) {
        Bai21.Author[] authors = new Bai21.Author[2];
        authors[0] = new Bai21.Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Bai21.Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
    }
}