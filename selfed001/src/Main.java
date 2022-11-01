public class Main {
    static int[][] array = new int[4][4];

    private static void printArray(int[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillArray(int[][] array) {
        int x, y = 0;
        int summ = 0;
        int gran = array[0].length;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                array[i][j] += i + j;
                if (array[i][j] == array[0])
            }
        }
    }

    public static void main(String[] args) {
        fillArray(array);
        printArray(array);
    }
}