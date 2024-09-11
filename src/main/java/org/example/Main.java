package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int number = scanner.nextInt();

        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = number / 100;

        int sumOfDigits = ones + tens + hundreds;

        System.out.println("Число единиц: " + ones);
        System.out.println("Число десятков: " + tens);
        System.out.println("Число сотен: " + hundreds);
        System.out.println("Сумма цифр: " + sumOfDigits);

    }
}