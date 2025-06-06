package Classes.Inheritance;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;
    //Constructor que inicializa los campos
    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }
    //Getters y Setter para acceder y modificar

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "partNumber='" + partNumber + '\'' +
                ", partDescription='" + partDescription + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", Total Amount=" + getInvoiceAmount() +
                '}';
    }

    public double getInvoiceAmount() {

        if (this.quantity < 0) {
            this.quantity = 0;
        }
        if (this.price < 0) {
            this.price = 0.0;
        }
        double totalAmount = this.quantity * this.price;
        return totalAmount;

    }
}
