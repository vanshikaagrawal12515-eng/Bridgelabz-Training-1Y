class Contact {
    String name;
    String phoneNumber;

    Contact(String name, String phone) {
        this.name = name;
        phoneNumber = phone;
    }

    void display() {
        System.out.println("Name: " + name + ", Phone: " + phoneNumber);
    }
}

class BusinessContact extends Contact {

    String companyName;

    BusinessContact(String name, String phone, String company) {
        super(name, phone);
        companyName = company;
    }

    void display() {
        System.out.println("Name: " + name.toUpperCase() + ", Phone: " + phoneNumber + ", Company: " + companyName);
    }
}

class ContactTest {
    public static void main(String[] args) {
        Contact c1 = new Contact("Prashant", "9999999999");
        Contact c2 = new BusinessContact("Rahul", "8888888888", "Infosys");

        c1.display();
        c2.display();
    }
}
