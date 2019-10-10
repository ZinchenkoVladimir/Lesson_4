package main.java;

public class Task_2_Boxer {

    private int age;
    private int weight;
    private int strength;

    public Task_2_Boxer (int age, int weight, int strength) {

        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight (Task_2_Boxer anotherBoxer) {

        if ((this.age < anotherBoxer.age && this.weight > anotherBoxer.weight) || (this.weight > anotherBoxer.weight && this.strength > anotherBoxer.strength) || (this.age < anotherBoxer.age && this.strength > anotherBoxer.strength)){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        Task_2_Boxer ourBoxer = new Task_2_Boxer(20, 65, 95);

        Task_2_Boxer anotherBoxer = new Task_2_Boxer(30,70,85);

        if (ourBoxer.fight(anotherBoxer)) {
            System.out.println("Our Boxer win!!! :)");
        }
        else System.out.println("Our Boxer loose :(");

        if (anotherBoxer.fight(ourBoxer)) {
            System.out.println("Another Boxer win");
        }
        else System.out.println("Another Boxer loose");
    }
}
