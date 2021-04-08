public class Polymorphism {
    public static void main(String[] args) {
        Employee employee = new Employee("Edho");
        employee.sayHello("Budi");

        employee = new Manager("Edho");
        employee.sayHello("Budi");

        employee = new VicePresident("Edho");
        employee.sayHello("Budi");

        sayHello(new Employee("Edho"));
        sayHello(new Manager("Dwi"));
        sayHello(new VicePresident("Tirwanda"));
    }

    static void sayHello(Employee employee) {
        if(employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if(employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
