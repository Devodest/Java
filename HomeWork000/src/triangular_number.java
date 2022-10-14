//Написать программу вычисления n-ого треугольного числа.


public class triangular_number {
    public static void main(String[] args) {
        int n = 5;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
            System.out.print(result + " ");

        }
    }
}