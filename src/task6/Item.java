package task6;

public class Item {
    private double weight;
    private double value;

    Item (double weight, double value) {
        setWeight(weight);
        setValue(value);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getWeight() {
        return weight;
    }

    public double getValue() {
        return value;
    }
}