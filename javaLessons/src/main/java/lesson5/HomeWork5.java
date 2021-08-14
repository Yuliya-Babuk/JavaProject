package lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Box<Apple> boxWithApples = new Box<>(apple1, apple2);
        Box<Orange> boxWithOranges = new Box<>(orange1, orange2, orange3);
        Box<Apple> boxWithApplesNew = new Box<>();
        System.out.println("Box of " + boxWithApples.getFruits().size() + " apples weights " + boxWithApples.getBoxWeight());
        System.out.println("Box of " + boxWithOranges.getFruits().size() + " oranges weights " + boxWithOranges.getBoxWeight());
        System.out.println("Are these boxes are equal? - " + boxWithApples.compare(boxWithOranges));
        boxWithApples.moveTo(boxWithApplesNew);
    }
}

class Fruit {
    private float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }
}

class Apple extends Fruit {
    public Apple() {
        super(1.0f);
    }
}

class Orange extends Fruit {
    public Orange() {
        super(1.5f);
    }
}

class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void setFruits(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public Box(T... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public void add(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public float getBoxWeight() {
        return getFruits().size() * getFruits().get(0).getWeight();
    }

    public boolean compare(Box another) {
        return this.getBoxWeight() == another.getBoxWeight();
    }

    public void clear() {
        fruits.clear();
    }

    public void moveTo(Box newBox) {
        newBox.getFruits().addAll(this.getFruits());
        clear();
    }
}