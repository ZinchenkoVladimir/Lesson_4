package main.java;

public class Task_3_Dog {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals("")) {
            this.name = name;
        } else {
            System.out.println("Name is empty\n");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age can't be less or equals to zero\n");
        }
    }

    public static void main(String[] args) {

        Task_3_Dog dog = new Task_3_Dog();

        dog.setAge(0);
        dog.setName("");

        Task_3_Dog dog2 = new Task_3_Dog();

        dog2.setAge(5);
        dog2.setName("Тузик");

        System.out.println("My name is " + dog2.getName() + "\n" + "My age is " + dog2.getAge());
    }
}
