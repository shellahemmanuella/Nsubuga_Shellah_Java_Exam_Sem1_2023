public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        // Setting the age and salary using the setter methods
        person.setAge(35);
        person.setSalary(500000.0);

        // Getting the age and salary using the getter methods
        int age = person.getAge();
        double salary = person.getSalary();

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}