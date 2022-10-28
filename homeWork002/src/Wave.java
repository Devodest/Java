import java.util.Random;

public class Wave {
    static int[][] array = new int[10][10];
    static Random rnd = new Random();
    static int rows = array[0].length;
    static int columns = array[1].length;

    static int right, left, up, down, start, end = 0;
    static int startRow = 5;
    static int startColumn = 3;

    static int endRow = 8;
    static int endColumn = 8;

    static int k = 0;

    static void print(int[][] array) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                String sf1 = String.format(" %2s ", array[i][j]);
                System.out.print(sf1);
            }
            System.out.println();
        }
    }

    static void filling(int[][] array) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][0] = -1;
                array[0][j] = -1;
                array[i][columns - 1] = -1;
                array[rows - 1][j] = -1;
            }
        }
    }

    static void waveFill(int[][] array) {
        for (int i = 0; i < rows-2; i++) {
            for (int j = 0; j < columns-2; j++) {
//                if (array[i][j] == -1)
//                array[i+1][j+1] += i+j;

            }
        }
    }

    public static void main(String[] args) {
        filling(array);
        waveFill(array);
        print(array);

    }

}