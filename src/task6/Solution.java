/*
Имеется набор вещей, которые необходимо поместить в рюкзак.
Рюкзак обладает заданной грузоподъемностью.
Вещи в свою очередь обладают двумя параметрами — весом и стоимостью.
Цель задачи заполнить рюкзак не превысив его грузоподъемность и максимизировать суммарную ценность груза.
 */
package task6;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Item> itemList = new LinkedList<>();

        try {
            System.out.println("Грузоподъемность рюкзака: ");
            Backpack backpack = new Backpack(scanner.nextDouble());

            createItemList(itemList, scanner);
            findMaxValue(backpack, itemList);

            System.out.println("Максимальная суммарная ценность груза: " + backpack.getValue());
        }
        catch (Exception e) {
            System.out.println("Введены не корректные данные.");
        }
    }

    public static void createItemList (List<Item> itemList, Scanner scanner) {
        System.out.println("Введите список предметов (для окончания ввода введите отрицательное значение или ноль в одно из полей): ");

        while (true) {
            System.out.println("___________________");
            System.out.println("Предмет№" + (itemList.size() + 1));
            System.out.print("Вес: ");
            double weight = scanner.nextDouble();
            if (weight > 0) {
                System.out.print("Ценность: ");
                double value = scanner.nextDouble();
                if (value > 0) {
                    itemList.add(new Item(weight, value));
                }
                else return;
            }
            else return;
        }
    }

    public static void findMaxValue (Backpack backpack, List<Item> itemList) {
        Backpack tempBackpack = new Backpack(backpack.getCapacity());

        for (int patternBackpack = 0; patternBackpack < Math.pow(2, itemList.size()); patternBackpack++) {

            tempBackpack.setCapacity(0);
            tempBackpack.setValue(0);

            for (int i = 0; i < itemList.size(); i++) {
                int maskForPatternBackpack = 1 << i;

                if ((patternBackpack & maskForPatternBackpack) > 0) {
                    tempBackpack.setValue(tempBackpack.getValue() + itemList.get(i).getValue());
                    tempBackpack.setCapacity(tempBackpack.getCapacity() + itemList.get(i).getWeight());
                }
            }
            if ((tempBackpack.getCapacity() <= backpack.getCapacity()) && (tempBackpack.getValue() > backpack.getValue()))
            {
                backpack.setValue(tempBackpack.getValue());
            }
        }
    }
}
