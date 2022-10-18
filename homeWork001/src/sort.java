import java.util.Arrays;
import java.util.Random;

public class sort {
    public static void main(String[] args) {
        int[] randomArray = getRandomArray();
        printArray(randomArray);
        sortArray(randomArray);
        printArray(randomArray);
    }

    private static int[] getRandomArray() {
        Random rnd = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10);
        }
        return array;
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
        }
    }
}



