package Inheritance;

public class Child extends Parent {

    public Child(int age) {
        //вызвали конструктор из parent
        super((age));
    }

    public Child() {
        super(0);
    }
    @Override
    public void show() {
        // super.show();
        System.out.println("Child's show");
    }

}
