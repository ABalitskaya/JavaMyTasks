package Inheritance;

 public class Parent {

     public Parent(int age) {
         this.age = age;
     }
     private int age;
    void show() {
        System.out.println("Parent's show");
    }

     public int getAge() {
         return age;
     }

     final public void setAge(int age) {
        this.age = age;
    }

}
