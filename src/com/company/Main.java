package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    System.out.println("Введите действие (+, *, **): ");
        String user_input = in.next();
        System.out.println("Введите 1 операнд: ");
        int a = in.nextInt();
        System.out.println("Введите 2 операнд: ");
        int b = in.nextInt();
        System.out.println("Введите модуль: ");
        int c_module = in.nextInt();
        switch (user_input) {
            case "+" -> System.out.printf("%d mod %d", ((a + b) % c_module), c_module);
            case "*" -> System.out.printf("%d mod %d", ((a * b) % c_module), c_module);
            case "**" -> System.out.printf("%f mod %d", (Math.pow(a, b) % c_module), c_module);
            default -> System.out.println("Error");
        }
    }
}
