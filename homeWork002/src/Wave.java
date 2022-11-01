import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Wave {
    static int[][] array = new int[10][10];
    static int[][] calcResult = new int[10][10];
    static int rows = array[0].length;
    static int columns = array[1].length;

    static List<String> visited = new ArrayList<>();

    int x, y = 0;

    static void print(int[][] array) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                String sf1 = String.format(" %2s ", array[i][j]);
                System.out.print(sf1);
            }
            System.out.println();
        }
    }

    static void filling() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][0] = -1;
                array[0][j] = -1;
                array[i][columns - 1] = -1;
                array[rows - 1][j] = -1;
            }
        }
    }
    static void waveFill(int x, int y){
        waveFill(x, y, 0);
    }
    static void waveFill(int x, int y, int score) {
        System.out.printf("CURRENT POINT %s %s\n", x, y);
        String key = x+"|"+y;
        if(visited.contains(key))
            return;
        else
            visited.add(x+"|"+y);

        if(array[x][y] < 0){
            System.out.println("This is wall");
            return;
        }

        if(calcResult[x][y] > score || calcResult[x][y] == 0){
            calcResult[x][y] = score;
        }

        int next = score + 1;

        if(y - 1 >= 0){
            System.out.printf("Top %s %s\n", x, y - 1);
            waveFill(x,y-1, next);
        }
        if(y + 1 < 10){
            System.out.printf("Bottom %s %s\n", x, y + 1);
            waveFill(x,y+1, next);
        }
        if(x - 1 >= 0){
            System.out.printf("Left %s %s\n", x - 1, y);
            waveFill(x - 1,y, next);
        }
        if (x + 1 < 10){
            System.out.printf("Right %s %s\n", x + 1, y);
            waveFill(x + 1,y, next);
        }
    }

    public static void main(String[] args) {
        filling();
        calcResult = array.clone();
        waveFill(6, 6);
        print(calcResult);

    }

}