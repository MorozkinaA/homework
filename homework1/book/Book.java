package homework1.book;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String toStringResult = "Book[name = " + name + ", authors = {";
        for(Author a : authors){
            toStringResult += "Author[name = " + a.name + ", email = " + a.email + ", gender = " + a.gender + "] ";
        }
        toStringResult += "}, price = " + price + ", qty = " + qty;
        return toStringResult;
    }

    public String getAuthorNames() {
        String authorsNames = "";
        for(Author a : authors){
            authorsNames += a.name + ",";
        }
        return authorsNames;
    }

}

