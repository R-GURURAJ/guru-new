
public class author_class {
    public static void main(String[] args) {
        Author a = new Author("guru", "harish@gmail.com", 'm');
        Book book = new Book("java full ref", a, 12.000, 21);
        book.getAuthor();
        book.getBookName();
        book.getQtyInStock();
        book.setQtyInStock(21);
        book.getPrice();
        book.setPrice(23.900);
        book.getPrice();
    }
}

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void hell() {
        System.out.println(name);
        System.out.println(email);
        System.out.println(gender);
    }
}

class Book {
    private String bookname;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String bookname, Author author, double price, int qtyInStock) {
        this.bookname = bookname;
        this.price = price;
        this.qtyInStock = qtyInStock;
        this.author = author;
    }

    void getBookName() {
        String hi = this.bookname;
        System.out.println(hi);
    }

    void getAuthor() {
        Author hi = this.author;
        hi.hell();
    }

    void getPrice() {
        double hi = this.price;
        System.out.println(hi);
    }

    void getQtyInStock() {
        int hi = this.qtyInStock;
        System.out.println(hi);
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
}