import java.util.*;
class Product{
    String productName;
    double price;
    int quantity;
    Product(String productName, double price, int quantity){
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
    }
    public double getTotal(){
        return price*quantity;
    }
    @Override
    public String toString(){
      return productName + " x" + quantity + " = " + (int)getTotal();
    }
}
class Order{
    String orderId;
    List<Product>products;
    Order(String orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public double calculateTotal() {
        double total = 0;

        for (Product p : products) {
            total += p.getTotal();
        }

        return total;
    }

    @Override
    public String toString() {
        String result = "Order ID: " + orderId + "\nProducts:\n";

        for (Product p : products) {
            result += p + "\n";
        }

        result += "Total: " + (int)calculateTotal();

        return result;
    }
}

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String orderId = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());

        Order order = new Order(orderId);

        for (int i = 0; i < n; i++) {
            String[] data = sc.nextLine().split(",");

            String name = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            Product p = new Product(name, price, quantity);
            order.addProduct(p);
        }

        System.out.println(order);
    }
}

