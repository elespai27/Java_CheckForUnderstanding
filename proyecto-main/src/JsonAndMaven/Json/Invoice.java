package JsonAndMaven.Json;

import java.util.List;

public class Invoice {
    private String id;
    private double total;
    private boolean isPaid;
    private List<InvoiceItem> items;

    public Invoice(String id, double total, boolean isPaid, List<InvoiceItem> items) {
        this.id = id;
        this.total = total;
        this.isPaid = isPaid;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public List<InvoiceItem> getItems() {
        return items;
    }

    public void setItems(List<InvoiceItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", total=" + total +
                ", isPaid=" + isPaid +
                ", items=" + items +
                '}';
    }
}
