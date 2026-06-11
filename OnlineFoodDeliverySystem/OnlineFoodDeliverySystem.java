class FoodItem{

    int itemId;
    String itemName;
    double price;
    int quantity;


    FoodItem(int itemId, String itemName, double price, int quantity){
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }


    double calculateamount(){
        return price * quantity;
    }
}


class Customer{

    int customerId;
    String customerName;
    String mobileNumber; 

    Customer(int customerId, String customerName, String mobileNumber){
        this.customerId = customerId;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
    }
    void displayCustomerDetails(){
        
    }
}
