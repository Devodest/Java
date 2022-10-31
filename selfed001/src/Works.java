//        7. Показать числа от -N до N
//
//        8. Показать четные числа от 1 до N
//
//        9. Показать последнюю цифру трёхзначного числа
//
//        10. Показать вторую цифру трёхзначного числа
//
//        11. Дано число из отрезка [10, 99]. Показать наибольшую цифру числа
//
//        12. Удалить вторую цифру трёхзначного числа
//
//        13. Выяснить, кратно ли число заданному, если нет, вывести остаток.
//
//        14. Найти третью цифру числа или сообщить, что её нет


import java.util.Scanner;

public class Works {

    public static void main(String[] args) {
    }

    private static void powNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write num for pow");
        int a = scanner.nextInt();
        int res = 0;
        res = a * a;
        System.out.println(res);
    }

    private static void firstPowSecond(int a, int b) {
        int temp = 0;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
            System.out.println("2 число являеется квадратом первого");
        } else if (a % b == 0)
            System.out.println("1 число являеется квадратом первого");
        else System.out.println("No");
    }

    private static void maxAndMin(int a, int b) {
        int max = 0;
        int min = 0;
        if (a > b) {
            max = a;
            min = b;
        } else {
            min = a;
            max = b;
        }
        System.out.println("Максимальное " + max + " Минимальное " + min);
    }


    private static void maxThreeNum(int a, int b, int c) {
        int max = a;
        if (max < b) {
            max = b;
            if (max < c)
                max = c;
        }
        System.out.println(max);
    }
    private static void nToN(int n){
        System.out.println(n);
    }
}