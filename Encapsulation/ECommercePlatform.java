import java.util.*;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails()
}
class Electronics extends Product implements Taxable {

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    public double calculateTax() {
        return getPrice() * 0.18; // 18% tax
    }

    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}

class Clothing extends Product implements Taxable {

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.15; // 15% discount
    }

    public double calculateTax() {
        return getPrice() * 0.05; // 5% tax
    }

    public String getTaxDetails() {
        return "Clothing Tax: 5%";
    }
}

class Groceries extends Product {

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

public class ECommercePlatform {

   
    public static void printFinalPrice(Product product) {

        double price = product.getPrice();
        double discount = product.calculateDiscount();
        double tax = 0;

        if (product instanceof Taxable) {
            Taxable t = (Taxable) product;
            tax = t.calculateTax();
            System.out.println(t.getTaxDetails());
        }

        double finalPrice = price + tax - discount;

        System.out.println("Product: " + product.getName());
        System.out.println("Base Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(1, "Laptop", 50000));
        products.add(new Clothing(2, "Jacket", 3000));
        products.add(new Groceries(3, "Rice", 800));

        for (Product p : products) {
            printFinalPrice(p);
        }
    }
}