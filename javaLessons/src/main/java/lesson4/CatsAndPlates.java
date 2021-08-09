package lesson4;

public class CatsAndPlates {
    public static void main(String[] args) {
        Kitten[] kitten = {
                new Kitten("Vasya", 10, false),
                new Kitten("Murzik", 20, false),
                new Kitten("Pepe", 80, false)
        };
        Plate plate = new Plate(100);
        System.out.printf("Is %s well-fed? -  ",kitten[0].getName());
        System.out.println(kitten[0].eat(plate));
        System.out.printf("Is %s well-fed? -  ",kitten[1].getName());
        System.out.println(kitten[1].eat(plate));
        System.out.printf("Is %s well-fed? -  ",kitten[2].getName());
        System.out.println(kitten[2].eat(plate));
        plate.info();
        plate.addFood(10);
        plate.info();
    }
}

class Plate {

    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        food -= appetite;
    }

    public void addFood(int newFood) {
        food += newFood;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}

class Kitten {
    private String name;
    private int appetite;
    private boolean isWellFed;

    public Kitten(String name, int appetite, boolean isWellFed) {
        this.name = name;
        this.appetite = appetite;
        this.isWellFed = isWellFed;
    }
    public String getName(){
        return name;
    }

    public boolean eat(Plate plate) {
        if (!(plate.getFood() < appetite)) {
            plate.decreaseFood(appetite);
            return isWellFed = true;
        } else {
            System.out.print("(not enough food for your appetite) ");
            return isWellFed = false;
        }
    }
}

