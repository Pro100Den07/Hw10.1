package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();
        System.out.println("Квадрат числа " + number + " дорівнює " + number * number + ".");

        // 2
        double radius = 3.5;
        double height = 10.0;
        double volume = Math.PI * radius * radius * height;
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");

        // 3
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Масив чисел: " + java.util.Arrays.toString(numbers));
        System.out.println("Сума всіх елементів масиву дорівнює " + sum + ".");

        // 4
        scanner.nextLine();
        System.out.print("Введіть рядок: ");
        String inputString = scanner.nextLine();
        StringBuilder reversedString = new StringBuilder(inputString).reverse();
        System.out.println("Рядок в зворотньому порядку: " + reversedString);

        // 5
        System.out.print("Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();
        System.out.println("Результат " + a + "^" + b + " дорівнює " + Math.pow(a, b) + ".");

        // 6
        System.out.print("Введіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.print("Введіть текстовий рядок: ");
        String text = scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }

        scanner.close();
    }
}