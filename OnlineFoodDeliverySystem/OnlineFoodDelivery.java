import java.util.Scanner;

class FoodItem {
    private int itemId;
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(int itemId, String itemName, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateAmount() {
        return price * quantity;
    }

    public void displayItemDetails() {
        System.out.println("\nItem ID   : " + itemId);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : ₹" + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Amount    : ₹" + calculateAmount());
    }
}

class Customer {
    private int customerId;
    private String customerName;
    private String mobileNumber;

    public Customer(int customerId, String customerName, String mobileNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void displayCustomerDetails() {
        System.out.println("\n===== CUSTOMER DETAILS =====");
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Mobile Number : " + mobileNumber);
    }
}

public class OnlineFoodDelivery {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ONLINE FOOD DELIVERY SYSTEM =====");

        // Customer Input
        System.out.print("Enter Customer ID: ");
        int cid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String cname = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        Customer customer = new Customer(cid, cname, mobile);

        FoodItem[] items = new FoodItem[4];
        double totalBill = 0;

        // Food Item Input
        for (int i = 0; i < 4; i++) {
            System.out.println("\nEnter Details for Item " + (i + 1));

            System.out.print("Item ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Item Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            items[i] = new FoodItem(id, name, price, qty);
            totalBill += items[i].calculateAmount();
        }

        // Display Output
        customer.displayCustomerDetails();

        System.out.println("\n===== ORDER DETAILS =====");
        for (FoodItem item : items) {
            item.displayItemDetails();
            System.out.println("-----------------------");
        }

        System.out.println("\n===== ORDER SUMMARY =====");
        System.out.println("Customer Name : " + customer.getCustomerName());
        System.out.println("Total Bill    : ₹" + totalBill);
        System.out.println("=========================");

        sc.close();
    }
}