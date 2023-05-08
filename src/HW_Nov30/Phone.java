package HW_Nov30;

public class Phone {
    String number;
    String model;
    int weightInGrams;

    public Phone (String number, String model, int weightInGrams) {
        this.number = number;
        this.model = model;
        this.weightInGrams = weightInGrams;

    }

    public String getNumber() {
        return number;
    }

    public void receiveCall (String name) {

        System.out.println("Звонит " + name);
    }
}
