package Homework3.GenericMinMax;

public class MinMaxFinder<T extends Comparable<T>> {
    private T[] arr;

    // constructor
    public MinMaxFinder(T[] arr) {
        this.arr = arr;
    }

    public <T> void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public T min() {
        T min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min.compareTo(arr[i]) > 0)
                min = arr[i];
        }

        return min;

    }

    public T max() {
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max.compareTo(arr[i]) < 0)
                max = arr[i];
        }

        return max;

    }
}
