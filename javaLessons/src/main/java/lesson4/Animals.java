package lesson4;

public class Animals {
    public static void main(String[] args) {

        Cat catVasiliy = new Cat("cat Vasiliy ");
        Dog dogRyhor = new Dog("dog Ryhor ");
        catVasiliy.run(200);
        catVasiliy.swim(200);
        dogRyhor.run(400);
        dogRyhor.run(600);
        dogRyhor.swim(5);
        dogRyhor.swim(20);
        System.out.println("Number of objects: " + Animal.numberOfObjects);

    }
}

class Animal {
    //private int distance;
      /*  public Animal(int distance) {
            this.distance = distance;
      */
    private int limitRun, limitSwim;
    static int numberOfObjects = 0;

    {
        numberOfObjects += 1;
    }

    public Animal(int limitRun, int limitSwim) {
        this.limitRun = limitRun;
        this.limitSwim = limitSwim;
    }

    public void run(int distance) {
        if (distance <= limitRun)
            System.out.printf("have run %d m. \n", distance);
        else System.out.println("Animal can not run too far");
    }

    public void swim(int distance) {
        if (distance <= limitSwim)
            System.out.printf("have swam %d m. \n", distance);
        else System.out.println("Animal can not swim too far");
    }
}

class Cat extends Animal {
    private String name;


    public Cat(String name) {
        super(200, 0);
        this.name = name;
    }

    @Override
    public void run(int distance) {
        System.out.print(name);
        super.run(distance);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats can not swim.");
    }
}

class Dog extends Animal {
    private String name;

    public Dog(String name) {
        super(500, 10);
        this.name = name;
    }

    @Override
    public void run(int distance) {
        System.out.print(name);
        super.run(distance);
    }

    @Override
    public void swim(int distance) {
        System.out.print(name);
        super.swim(distance);
    }
}
