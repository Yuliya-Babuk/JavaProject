package lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {

        String[] arrStrings = new String[]{"Apple", "Orange"};
        System.out.println(Arrays.deepToString(arrStrings));
        swap(arrStrings, 0, 1);
        System.out.println(Arrays.deepToString(arrStrings));

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        ArrayList<Apple> fruitsApp = new ArrayList<>();
        fruitsApp.add(apple1);
        fruitsApp.add(apple2);
        Box<Apple> boxWithApples = new Box<>(fruitsApp);
        ArrayList<Orange> fruitsOr = new ArrayList<>();
        fruitsOr.add(orange1);
        fruitsOr.add(orange2);
        fruitsOr.add(orange3);
        Box<Orange> boxWithOranges = new Box<>(fruitsOr);
               System.out.println("Box of " + boxWithApples.getFruits().size() + " apples weights " + boxWithApples.getBoxWeight());
        System.out.println("Box of " + boxWithOranges.getFruits().size() + " oranges weights " + boxWithOranges.getBoxWeight());
        System.out.println("Are these boxes are equal? - " + boxWithApples.compare(boxWithOranges));
        Box<Apple> boxWithApplesNew = new Box<>(new ArrayList<>());
        boxWithApples.moveTo(boxWithApplesNew);
    }

    public static void swap(Object[] arr, int indexFirst, int indexSecond) {
        var temp = arr[indexFirst];
        arr[indexFirst] = arr[indexSecond];
        arr[indexSecond] = temp;
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

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public void addFruits(ArrayList<T> fruits) {
        this.fruits.addAll(fruits);
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
        newBox.addFruits(this.getFruits());
        clear();
    }
}