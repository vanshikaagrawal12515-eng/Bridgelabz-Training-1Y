

interface Worker {
    void performDuties(); 
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println(name + " is cooking specialty: " + specialty);
    }
}

class Waiter extends Person implements Worker {
    String section;

    Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    public void performDuties() {
        System.out.println(name + " is serving customers in section: " + section);
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Emma", 102, "Patio");

        chef.showInfo();
        chef.performDuties();

        System.out.println();

        waiter.showInfo();
        waiter.performDuties();
    }
}