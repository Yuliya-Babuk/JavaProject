package lesson8;

import java.util.*;

public class HomeWork8 {
    public static void main(String[] args) {
        HashSetExample.Run();
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Babuk","+3752911999999");
        phoneBook.add("Babuk","+3752911999933");
        phoneBook.add("Thurin","+3752911009999");
        phoneBook.add("Thurin","+3752911119999");
        phoneBook.add("Romashko","+3752911990999");
        phoneBook.add("Andreeva","+3752911991999");
        System.out.println("Phone numbers belonging to Babuk " + phoneBook.get("Babuk"));
        System.out.println("Phone numbers belonging to Thurin " + phoneBook.get("Thurin"));
    }
}
