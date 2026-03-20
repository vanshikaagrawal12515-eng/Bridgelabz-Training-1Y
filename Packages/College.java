class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

class Faculty {
    String name;
    String subject;

    Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void displayFaculty() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

public class College {
    public static void main(String[] args) {
        Student s = new Student("Amit", 101);
        s.displayStudent();

        System.out.println();

        Faculty f = new Faculty("Dr. Sharma", "Computer Science");
        f.displayFaculty();
    }
}