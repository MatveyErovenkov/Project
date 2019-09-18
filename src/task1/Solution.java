/*
Создать программу, которая будет сообщать,
является ли целое число, введенное пользователем,
чётным или нечётным, простым или составным.
Если пользователь введёт не целое число, то сообщать ему об ошибке.
*/
package task1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите целое число: ");
            int number = scanner.nextInt();

            System.out.println(number + " - " + checkedForEvenOrOddNumb(number)
                    + checkedForPrimeOrCompNumb(number));
        }
        catch (Exception e) {
            System.out.println("Введено некорректное значение.");
        }
    }

    private static String checkedForEvenOrOddNumb(int number) {
        return number % 2 == 0 ? "чётное, " : "нечётное, ";
    }

    private static String checkedForPrimeOrCompNumb(int number) {
        int numbOfDiv = 0;

        if (number <= 1) {
            return "не относится ни к простым ни к составным числам.";
        }

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                numbOfDiv++;
            }
        }

        return numbOfDiv > 1 ? "состовное число." : "простое число.";
    }
}