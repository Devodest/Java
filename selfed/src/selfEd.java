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
            res = Math.pow(a, 1);
            return res;
        } else if (a == 0) System.out.println("Не определенно");
        else {
            res = Math.pow(a, b);
            return res;
        }
        return 0;
    }

    static Map<String, Double> fileReader() {
        Map<String, Double> map = new HashMap<>();
        try (BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Hart\\Desktop\\Java_education\\selfed\\src\\input.txt"))) {
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
        try (FileWriter fw = new FileWriter("C:\\Users\\Hart\\Desktop\\Java_education\\selfed\\src\\output.txt")) {
            fw.write(String.valueOf(res));
        } catch (IOException e){
            System.out.println("There was a problem: " + e);
            e.printStackTrace();
        }
    }
}