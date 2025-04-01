public class Generics2 {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        swap(numbers, 1, 3);
        for (int num : numbers) System.out.print(num + " ");
    }
}

