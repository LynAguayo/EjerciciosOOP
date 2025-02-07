public class Quotation {

    // Atributos
    private String quote;
    private String author;

    // Constructor
    public Quotation(String quote, String author) {
        this.quote = quote;
        this.author = author;
    }

    // Setters y getters
    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    // Método para printear los attr
    public void display(){
        System.out.println("Quote: " + this.getQuote());
        System.out.println("Author: " + this.getAuthor());
    }
}
