package HW_Nov30;

public class ObjectsPerson {
    public static void main(String[] args) {
        Person person1;
        Person person2;

        person1 = new Person("Vasya", 5);
        person2 = new Person();
        person2.name = "Irina";
        person2.age = 100;

        person1.talk("Ivan");
        person2.move("Masha");
    }
}
