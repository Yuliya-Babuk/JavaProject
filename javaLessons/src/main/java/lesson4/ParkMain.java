package lesson4;

import java.util.Scanner;

public class ParkMain {
    public static void main(String[] args) {
        Park parkGorkiy = new Park("Gorkiy");
        parkGorkiy.info();
    }
}

class Park {
    private String name;
    private Attraction[] attractions;

    public Park(String name) {
        this.name = name;
    }

    public void info() {
        System.out.print(name + " park\nEnter the number of attractions in the park: ");
        Scanner br = new Scanner(System.in);
        int number = br.nextInt();
        attractions = new Attraction[number];
        for (int i = 0; i < number; i++) {
            attractions[i] = new Attraction();
            attractions[i].info();
        }
    }

    private class Attraction {
        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        private String name;
        private int price;
        private String openHours;

        public Attraction() {
        }

        public void info() {
            Scanner data = new Scanner(System.in);
            System.out.print("Enter attraction name: ");
            name = data.next();
            System.out.print("Enter price: ");
            price = data.nextInt();
            System.out.print("Enter hours: ");
            openHours = data.next();
            System.out.println("Name:\n" + name + "\nPrice:\n" + price + "\nOpen hours:\n" + openHours);
        }
    }
}

