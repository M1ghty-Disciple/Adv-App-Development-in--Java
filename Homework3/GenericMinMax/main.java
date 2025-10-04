package Homework3.GenericMinMax;

public class main {
    public static void main(String[] args) {
        Integer[] numIntegers = { 5, 2, 9, 1, 7 };
        MinMaxFinder<Integer> intNum = new MinMaxFinder<>(numIntegers);

        Double[] numDoubles = { 3.5, 7.2, 1.8, 9.0 };
        MinMaxFinder<Double> doubleNum = new MinMaxFinder<>(numDoubles);

        String[] fruits = { "Apple", "Mango", "Banana", "Cherry" };
        MinMaxFinder<String> fruit = new MinMaxFinder<>(fruits);

        System.out.print("Integer Array: ");
        intNum.printArray();
        System.out.print("\nMin: " + intNum.min() + ", Max: " + intNum.max());

        System.out.print("\nDouble Array: ");
        doubleNum.printArray();
        System.out.print("\nMin: " + doubleNum.min() + ", Max: " + doubleNum.max());

        System.out.print("\nString Array: ");
        fruit.printArray();
        System.out.print("\nMin: " + fruit.min() + ", Max: " + fruit.max());

    }
}
