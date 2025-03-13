import java.util.ArrayList;

// Customer class representing a customer in the e-commerce platform
class Customers {
    private String name;
    private ArrayList<Order> orders;

    // Constructor
    public Customers(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Method to place an order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Method to display customer details
    public void displayCustomerDetails() {
        System.out.println("Customer: " + name);
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

// Order class representing an order placed by a customer
class Order {
    private int orderId;
    private ArrayList<Product> products;

    // Constructor
    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Method to add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product product : products) {
            product.displayProductDetails();
        }
    }
}

// Product class representing a product in the e-commerce platform
class Product {
    private String productName;
    private double price;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: $" + price);
    }
}

// Main class to demonstrate the e-commerce platform system
public class ECommercePlatform {
    public static void main(String[] args) {
        // Creating a customer
        Customers customer = new Customers("John Doe");

        // Creating an order
        Order order1 = new Order(101);
        Order order2 = new Order(102);

        // Creating products
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Smartphone", 800.00);
        Product product3 = new Product("Headphones", 150.00);

        // Adding products to orders
        order1.addProduct(product1);
        order1.addProduct(product2);
        order2.addProduct(product3);

        // Customer places orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Display customer details including orders and products
        customer.displayCustomerDetails();
    }
}
