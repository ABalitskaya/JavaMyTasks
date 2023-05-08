package Inheritance;

public class Pineaple extends Fruit {

    private int cellulose;

    public void setCellulose(int cellulose) {
        this.cellulose = cellulose;
    }

    public int getCellulose() {
        return cellulose;
    }

    public Pineaple() {
        System.out.println("Constructor of class Pineaple" );
        System.out.println("Hashcode is: " + this.hashCode());
        System.out.println("Hashcode superclass is: " + super.hashCode());
        System.out.println("Class name is: " + this.getClass().getName());
        System.out.println("Super class name is: " + super.getClass().getName());
    }

    @Override //перезаписал функцию
    public String toString() {
        String res = super.toString();
        return res + "\n cellulose is: " + cellulose;
    }
    public void addToSugar(int a, int m) {
        setSugar((getSugar() + a) * m);
    }

    public void addToSugar(int a) {
        setSugar(getSugar() + a );
    }
}
