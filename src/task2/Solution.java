/*
Создать программу, которая будет
вычислять и выводить на экран НОК (наименьшее общее кратное)
и НОД (наибольший общий делитель) двух целых чисел, введенных пользователем.
Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */

package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первое, челое число: ");
            int numFirst = Math.abs(scanner.nextInt());

            System.out.print("Введите второе, челое число: ");
            int numSecond = Math.abs(scanner.nextInt());

            System.out.println("НОД: " + gcd(numFirst, numSecond));
            System.out.println("НОК: " + lcm(numFirst, numSecond));
        }
        catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение.");
        }
        catch (ArithmeticException e) {
            System.out.println("НОК для (0, 0) не существует");
        }
    }

    private static int gcd (int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static int lcm (int a, int b) {
        return a * (b / gcd(a, b));
    }
}