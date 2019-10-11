package main.java;

public class Task_1_Human {

    public static void main(String[]args){

        Human newHuman = new Human("Izya", "Shniperson", 110, 95,185);

        newHuman.speak();
    }
}

class Human {

    private String first_name;
    private String last_name;
    private int weight;
    private int age;
    private int height;

    public Human (String first_name, String last_name, int weight, int age, int height){

        this.first_name = first_name;
        this.last_name = last_name;
        this.weight = weight;
        this.age = age;
        this.height = height;
    }

    public void speak (){

        System.out.println("Hi! I am " + this.first_name + " " + this.last_name + ", I have " + this.weight + " kg, " + this.age + " years old, and " + this.height + " cm height.");
    }
}
