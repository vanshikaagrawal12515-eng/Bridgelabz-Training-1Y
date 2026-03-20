class HarryAge {
    
    int birthYear = 2000;
    int currentYear = 2024;

    void calculateAge() {
        int age = currentYear - birthYear;
        System.out.println("Harry's age in 2024 is " + age);
    }

    public static void main(String[] args) {
        HarryAge obj = new HarryAge();
        obj.calculateAge();
    }
}