package otus.practice.dz;

import Utils.StringUtils;

import java.util.ArrayList;

public class Animal {
    public String name;
    public int age;
    public int weight;
    public String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Say(){
        System.out.println("Я говорю");
    }
    public void Go(){
        System.out.println("Я иду");
    }
    public void Drink(){
        System.out.println("Я пью");
    }
    public void Eat(){
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        return "Привет! меня зовут " + name + ", мне " + age + " " + StringUtils.yearStringByCount(age) + ", " +
                "я вешу " + weight + " кг," +
                " мой цвет - " + color;
    }

}