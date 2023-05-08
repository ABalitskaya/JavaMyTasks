package Inheritance;

public class App {
    public static void main(String[] args) {
        Pineaple pineaple = new Pineaple();
        pineaple.setSugar(10);
        pineaple.setVitamins(new String[] {"A", "B"});
        pineaple.setCellulose(3);
        System.out.println(pineaple);

        System.out.println(pineaple.toString());

        pineaple.addToSugar(3);
        System.out.println(pineaple.toString());

        pineaple.addToSugar(1,2);
        System.out.println(pineaple.toString());

        Summator summator = new Summator();
        String res1 = summator.sum("Ira", "Vanya");
        int res2 = summator.sum(10, 20);
        double res3 = summator.sum(12.1, 18.5);
        double res4 = summator.sum(11.555, 6);

        System.out.println(
                String.format(
                        "res1 is: %s\n res2 is: %d\nres3 is : %f\n", res1, res2, res3
                )
        );

        Parent p1 = new Parent(5);
        Parent p2 = new Child(2);
        p1.show();
        p2.show();

        //Fruit fruit = new Fruit();
        //System.out.println(fruit);
    }
}
