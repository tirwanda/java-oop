class Person  {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress) {
        this.name = paramName;
        this.address = paramAddress;
    }

    Person(String paramName) {
//        name = paramName;
        this(paramName,null);
    }

    Person() {
        this(null);
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + this.name);
    }
}
