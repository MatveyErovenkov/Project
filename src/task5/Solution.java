/*
Создать программу, которая в последовательности от 0 до N,
находит все числа-палиндромы (зеркальное значение равно оригинальному).
Длина последовательности N вводится вручную и не должна превышать 100.
 */
package task5;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длинну последовательности:");
        int n = scanner.nextInt();

        if (n < 100) {
            findAndPrintPalindrome(n);
        }
        else System.out.println("Длинна последовательности не должна привышать 100, т.е. от 0 до 99 включительно.");
    }

    private static void findAndPrintPalindrome (int n) {
        for (int i = 0; i <= n; i++) {
            if (Integer.toString(i).substring(0, 1).equals(Integer.toString(i).substring(1))) {
                System.out.println(i);
            }
        }
    }
}