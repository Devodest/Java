import java.awt.*;
import java.io.*;
import java.util.*;

public class selfEd {
    public static void main(String[] args) {
        Map<String, Double> list = fileReader();
        double a = list.get("a");
        double b = list.get("b");
        double res = raisingNumber(a, b);
        fileWriter(res);

    }

    static double raisingNumber(double a, double b) {
        double res = 0;
        if (b == 0) {
            b = 1;
            res = a * b;
            return res;
        } else if (a == 0) System.out.println("Не определенно");
        else if (b < 0) {
            res = a;
            for (int i = -1; i > b; i--) {
                res *= a;
            }
            return 1 / res;
        } else {
            res = a;
            for (int i = 0; i < b; i++) {
                res *= a;
                b--;
            }
            return res;
        }
        return 0;
    }

    static Map<String, Double> fileReader() {
        Map<String, Double> map = new HashMap<>();
        try (BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Devodest\\Desktop\\Java\\selfed\\src\\input.txt"))) {
            String read = null;
            while ((read = in.readLine()) != null) {
                String[] split = read.split(" ");
                map.put(split[0], Double.parseDouble(split[1]));
            }
        } catch (IOException e) {
            System.out.println("There was a problem: " + e);
            e.printStackTrace();
        }
        return map;
    }

    static void fileWriter(double res) {
        try (FileWriter fw = new FileWriter("C:\\Users\\Devodest\\Desktop\\Java\\selfed\\src\\output.txt")) {
            fw.write(String.valueOf(res));
        } catch (IOException e) {
            System.out.println("There was a problem: " + e);
            e.printStackTrace();
        }
    }
}