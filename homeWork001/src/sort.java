import java.util.Random;

public class sort {
    public static void main(String[] args) {
        int[] randomArray = getRandomArray();
    }

    private static int[] getRandomArray() {
        Random rnd = new Random(10);
        int[] array = new int[rnd.nextInt() + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt();
        }
        return array;
    }

    private int []

}
