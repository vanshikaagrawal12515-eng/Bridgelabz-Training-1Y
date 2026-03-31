class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item1 = new Item(101, "Notebook", 50.0);

        item1.displayDetails();
        int quantity = 3;
        double total = item1.calculateTotalCost(quantity);

        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }
}