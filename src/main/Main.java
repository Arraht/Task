package main;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        Напишите код, с помощью которого можно разделить строку на части.
//        Код должен работать для строк любого размера и любого содержания.
//        Размер частей вы устанавливаете самостоятельно.
        System.out.print("Строка: ");
        String words = scanner.nextLine();
        System.out.print("Разделитель: ");
        String separator = scanner.nextLine();
        String[] parts = words.split(separator);
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
    }
}