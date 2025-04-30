package JsonAndMaven.Json;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<InvoiceItem> invoiceItems = List.of(new InvoiceItem("Coca Cola 2L", 10),
                new InvoiceItem("Rum Santa Teresa 0.7L", 15),
                new InvoiceItem("Ice bag L", 5.5));
        Invoice invoice = new Invoice("YMZ-0000001", 30.5, false, invoiceItems);
        System.out.println(invoice);
    }
}
