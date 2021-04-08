public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Edho", "Bekasi");
        Person person2 = new Person("Dwi");
        Person person3 = new Person();
        person3.name = "Tirwanda";

        var manager = new Manager("Edho");
        manager.sayHello("Budi");

        var vicePresident = new VicePresident("Bambang");
        vicePresident.sayHello("Budi");

//        System.out.println(person1.name);
//        System.out.println(person1.address);
//        person1.sayHello("Budi");
    }
}
