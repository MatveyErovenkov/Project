/*
Создать программу, которая будет:
подсчитывать количество слов в предложении
выводить их в отсортированном виде
делать первую букву каждого слова заглавной.
Предложение вводится вручную. (Разделитель пробел (“ ”)).
*/
package task3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> listWords = new LinkedList<>();

        System.out.println("Введите предложение:");
        String text = scanner.nextLine();

        toUpperCaseAndAddList(text, listWords);
        Collections.sort(listWords);

        System.out.println("Количество слов в предложении: " + listWords.size());

        printListWords(listWords);
    }

    private static void toUpperCaseAndAddList(String text, List<String> listWords) {
        for (String word : text.split(" ")) {
            if (!word.equals("")) {
                listWords.add(word.substring(0, 1).toUpperCase() + word.substring(1));
            }
        }
    }

    private static void printListWords (List<String> listWords) {
        for (String word : listWords) {
            System.out.print(word + " ");
        }
    }
}