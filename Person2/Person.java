public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Jonathan", 20, "GW-2883-0902");
        Person person2 = new Person("Desmond", 23, "GW-3923-2937");

        System.out.println("Person 1:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Address: " + person1.getAddress());

        System.out.println("Person 2:");
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Address: " + person2.getAddress());

        person1.setAddress("GN-9867-8543");
        System.out.println("Person 1's new address: " + person1.getAddress());
    }
}


