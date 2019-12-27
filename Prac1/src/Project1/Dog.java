package Project1;

import java.lang.*;
public class Dog {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Dog(String name, int age){
        setName(name);
        setAge(age);
    }
    public Dog(String name){
        setName(name);
        age = 0;
    }

    public String toString(){
        return "Кличка: " + getName()+ "\nВозраст: " + getAge();
    }

    public void toHumanAge(){
        System.out.println(getAge() + " 'собачьих' равняется " + getAge()*7 + " человеческим годам");
    }
}

