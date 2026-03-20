class Employee {
    int empId;
    String name;

    Employee(int id, String name) {
        empId = id;
        this.name = name;
    }

    String generateEmail() {
        return name.toLowerCase() + "@company.com";
    }
}

class Manager extends Employee {

    String department;

    Manager(int id, String name, String dept) {
        super(id, name);
        department = dept;
    }

    String generateEmail() {
        return name.toLowerCase() + "." + department.toLowerCase() + "@company.com";
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Prashant");
        Manager m = new Manager(2, "Rahul", "HR");

        System.out.println(e.generateEmail());
        System.out.println(m.generateEmail());
    }
}
