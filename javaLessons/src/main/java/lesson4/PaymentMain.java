package lesson4;

import java.util.Scanner;

public class PaymentMain {

    public static void main(String[] args) {

        Payment payment = new Payment("Payment for 08/08/2021");
        System.out.println(payment.getName());
        payment.calculatePayment();
    }
}

class Payment {

    public String getName() {
        return name;
    }

    private String name;

    private Product[] products;

    private int cost;

    private class Product {

        private String productName;

        private int productCost;

        public Product(String productName, int productCost) {

            this.productName = productName;
            this.productCost = productCost;

        }
    }

    public Payment(String name) {

        this.name = name;

    }

    public void calculatePayment() {

        cost = 0;

        System.out.print("Enter the number of products you want to buy: ");

        Scanner br = new Scanner(System.in);

        int number = br.nextInt();
        products = new Product[number];

        for (int i = 0; i < number; i++) {

            System.out.println("Product " + (i + 1) + ": ");
            System.out.print("Name: ");

            String productName = br.next();
            System.out.print("Price: ");
            int productCost = br.nextInt();

            products[i] = new Product(productName, productCost);
            cost = cost + products[i].productCost;
        }
        System.out.println("Total payment: " + cost);
    }
}
