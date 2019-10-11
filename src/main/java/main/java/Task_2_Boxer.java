package main.java;

public class Task_2_Boxer {

    private int age;
    private int weight;
    private int strength;

    private Task_2_Boxer (int age, int weight, int strength) {

        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    private boolean fight (Task_2_Boxer anotherBoxer) {

        if (this.age == anotherBoxer.age && this.weight == anotherBoxer.weight && this.strength == anotherBoxer.strength) {
            return true;
        }
        else
            if (this.age == anotherBoxer.age && this.weight == anotherBoxer.weight) {
                return this.strength > anotherBoxer.strength;
            }
            else
                if (this.weight == anotherBoxer.weight && this.strength == anotherBoxer.strength) {
                    return this.age < anotherBoxer.age;
                }
                else
                    if (this.age == anotherBoxer.age && this.strength == anotherBoxer.strength) {
                        return this.weight > anotherBoxer.weight;
                    }
                    else
                        if (this.age == anotherBoxer.age) {
                            return this.weight > anotherBoxer.weight && this.strength > anotherBoxer.strength;
                        }
                        else
                            if (this.weight == anotherBoxer.weight) {
                                return this.age < anotherBoxer.age && this.strength > anotherBoxer.strength;
                            }
                            else
                                if (this.strength == anotherBoxer.strength) {
                                    return this.age < anotherBoxer.age && this.weight > anotherBoxer.weight;
                                }
                                else return (this.age < anotherBoxer.age && this.weight > anotherBoxer.weight) || (this.weight > anotherBoxer.weight && this.strength > anotherBoxer.strength) || (this.age < anotherBoxer.age && this.strength > anotherBoxer.strength);
    }

    public static void main(String[] args) {

        Task_2_Boxer ourBoxer = new Task_2_Boxer(25, 65, 85);

        Task_2_Boxer anotherBoxer = new Task_2_Boxer(30,70,85);

        if (ourBoxer.fight(anotherBoxer)) {
            System.out.println("Our Boxer win!!! :)\nAnother Boxer loose");
        }
        else System.out.println("Our Boxer loose :(\nAnother Boxer win");
    }
}
