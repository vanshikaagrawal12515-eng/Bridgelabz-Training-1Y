class Order {
    int orderId;
    double baseAmount;
    static double deliveryCharge = 40;

    Order(int id, double amount) {
        orderId = id;
        baseAmount = amount;
    }

    double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}

class RegularOrder extends Order {

    RegularOrder(int id, double amount) {
        super(id, amount);
    }

    double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}

class PremiumOrder extends Order {

    PremiumOrder(int id, double amount) {
        super(id, amount);
    }

    double calculateBill() {
        double discount = baseAmount * 0.20;
        return baseAmount - discount + deliveryCharge;
    }
}

class FoodTest {
    public static void main(String[] args) {
        Order o1 = new RegularOrder(101, 500);
        Order o2 = new PremiumOrder(102, 500);

        System.out.println("Regular Bill: " + o1.calculateBill());
        System.out.println("Premium Bill: " + o2.calculateBill());
    }
}
