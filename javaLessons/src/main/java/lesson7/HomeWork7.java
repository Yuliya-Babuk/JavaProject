package lesson7;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        int headers = 3;
        int lines = 2;
        String path = "CSVFile.csv";
        AppData appData = new AppData(new String[headers], new int[lines][headers]);
        appData.saveToScv(path);
        appData.readFromScv(path);
    }
}

class AppData {
    private String[] header;
    private int[][] data;
    public String[] getHeader() {
        return header;
    }
    public void setHeader(String[] header) {
        this.header = header;
    }
    public int[][] getData() {
        return data;
    }
    public void setData(int[][] data) {
        this.data = data;
    }
    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }
    public void saveToScv(String path) {
        File file = new File(path);
        Random rnd = new Random();
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            StringBuilder str = new StringBuilder();
            for (int i = 1; i <= getHeader().length; i++) {
                str.append(String.format("value%d", i));
                str.append(';');
            }
            str.append("\n");
            for (int i = 1; i <= getData().length; i++) {
                for (int j = 1; j <= getData()[0].length; j++) {
                    str.append(rnd.nextInt(300));
                    str.append(';');
                }
                str.append("\n");
            }
            writer.write(str.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readFromScv(String path) {
        File file = new File(path);
        Scanner scanner;
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                scanner = new Scanner(line);
                scanner.useDelimiter("\n");
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}