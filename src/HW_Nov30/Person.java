package HW_Nov30;

public class Person {
    String name;
    int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person () {
        name = "";
        age = age;
    }

    public void talk (String name) {
        System.out.println(name + " " + "is speaking");
    }
    public void move (String name) {
        System.out.println(name + " " + "speaking");

    }
}


