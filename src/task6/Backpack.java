package task6;

import java.util.Scanner;

public class Backpack {
    private double capacity;
    private double value = 0;

    Backpack (double capacity) {
        setCapacity(capacity);
    }

    public void setCapacity(double capacity) {
        if (capacity >= 0) {
            this.capacity = capacity;
        }
        else if (capacity < 0) {
            System.out.println("Грузоподъемность может быть только положительным значением, ");
            System.out.println("попробуйте ввести значение ещё раз: ");
            setCapacity(new Scanner(System.in).nextDouble());
        }
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getValue() {
        return value;
    }
}