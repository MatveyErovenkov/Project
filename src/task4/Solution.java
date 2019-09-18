/*
Создать программу, которая подсчитывает
сколько раз употребляется слово в тексте (без учета регистра).
Текст и слово вводится вручную.
 */

package task4;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите предложение:");
        String text = scanner.nextLine();

        System.out.println("Введите искомое слово:");
        String wordSearch = scanner.nextLine();

        System.out.println("В тексте слово \"" + wordSearch
                + "\" употребляется " + wordSearch(text, wordSearch) + " раз");
    }

    private static int wordSearch (String text, String wordSearch) {
        int numberWordSearch = 0;

        for (String word : text.split(" ")) {
            if(word.compareToIgnoreCase(wordSearch) == 0) {
                numberWordSearch++;
            }
        }
        return numberWordSearch;
    }
}