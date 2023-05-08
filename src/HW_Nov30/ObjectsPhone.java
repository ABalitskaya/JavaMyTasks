package HW_Nov30;

public class ObjectsPhone {
    public static void main(String[] args) {
        Phone phone1;
        Phone phone2;
        Phone phone3;

        phone1 = new Phone("+995(599)0000000", "AirBlue-210", 340);
        phone2 = new Phone("032 000 891 423", "RH-800", 280);
        phone3 = new Phone("+41 829 8811", "V4-78-W", 380);

        System.out.println(phone1.number + " " + phone1.model + " " + phone1.weightInGrams + "grams");
        System.out.println(phone2.number + " " + phone2.model + " " + phone2.weightInGrams + "grams");
        System.out.println(phone3.number + " " + phone3.model + " " + phone3.weightInGrams + "grams");

        System.out.println("Number of phone1 is " + phone1.getNumber());
        System.out.println("Number of phone2 is " + phone2.getNumber());
        System.out.println("Number of phone3 is " + phone3.getNumber());

        phone1.receiveCall("Friend");
        phone2.receiveCall("Wife");
        phone3.receiveCall("Dog");




    }
}
