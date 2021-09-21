public class Member {

    private String Name, Address, Number;
    private int Age;
    private double Salary;

    void printSalary() {
        System.out.println("The Slary Is " + Salary);
    }

    static class Employee extends Member {

        private String Specialization;

    }

    static class Manager extends Member {

        private String Department;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getNumber() {
        return Number;
    }

    public int getAge() {
        return Age;
    }

    public double getSalary() {
        return Salary;
    }

    public void setName(String newName) {
        Name = newName;
    }

    public void setAddress(String newAddress) {
        Address = newAddress;
    }

    public void setNumber(String newNumber) {
        Number = newNumber;
    }

    public void setAge(int newAge) {
        Age = newAge;
    }

    public void setSalary(double newSalary) {
        Salary = newSalary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Hakan Calhanoglu");
        e1.setAge(24);
        e1.setNumber("123456789-9");
        e1.setAddress("Gulistan E Jauhar");
        e1.setSalary(50000);
        e1.Specialization = "Quality Assurance";
        System.out.println("=========================");
        System.out.println("\nThe Employee Detail Is\n");
        System.out.println("=========================");
        System.out.println("The Name is " + e1.getName());
        System.out.println("The Address is " + e1.getAddress());
        System.out.println("The Number is " + e1.getNumber());
        System.out.println("The Age is " + e1.getAge());
        System.out.println("The Specialization  is " + e1.Specialization);
        e1.printSalary();
        System.out.println("=========================");
        System.out.println("\nThe Manager Detail Is\n");
        System.out.println("=========================");
        Manager m1 = new Manager();
        m1.setName("Tayyab");
        m1.setAge(28);
        m1.setNumber("1235977-9");
        m1.setAddress("Gulishan E iqbal");
        m1.setSalary(30000);
        m1.Department = "Web Design";
        System.out.println("The Name is " + m1.getName());
        System.out.println("The Address is " + m1.getAddress());
        System.out.println("The Number is " + m1.getNumber());
        System.out.println("The Age is " + m1.getAge());
        System.out.println("The Salary is " + m1.getSalary());
        System.out.println("The Dept is " + m1.Department);
        m1.printSalary();

    }
}