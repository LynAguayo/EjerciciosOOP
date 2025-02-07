public class Shirt {
    // Atributos
    private int shirtID;
    private String description;
    private char size;
    private double price;
    private int quantityInStock;

    // Constructor
    public Shirt(int shirtID, String description, char size, double price, int quantityInStock) {
        this.shirtID = shirtID;
        this.description = description;
        this.size = size;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    // Setters y getters
    public void setShirtID(int shirtID) {
        this.shirtID = shirtID;
    }

    public int getShirtID() {
        return shirtID;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public char getSize() {
        return size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    // Método para mostrar los attributos
    public void displayInformation() {
        System.out.println("TShirt {ShirtID: " + getShirtID() +
                           ", Description: " + getDescription() +
                           ", Size: " + getSize() +
                           ", Price: " + getPrice() +
                           ", QuantityInStock: "+getQuantityInStock() + "}");
    }

    // Método para incrementar el valor del atributo quantityInStock
    public void addStock(int increment) {
        int newStock = getQuantityInStock() + increment;
        setQuantityInStock(newStock);
    }
}
