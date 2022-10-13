//На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
//        - команда 1 (к1): увеличить a с раза, а умножается на c
//        - команда 2 (к2): увеличить на d, к a прибавляется d
//        написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
//        Пример 1: а = 1, b = 7, c = 2, d = 1
//        ответ: к2, к2, к2, к2, к2, к2, k2 или к1, к1, к2, к2, к2
//        Можно начать с более простого – просто подсчёта общего количества вариантов
//        Пример 2: а = 11, b = 7, c = 2, d = 1
//        ответ: нет решения.
//        *Подумать над тем, как сделать минимальное количество команд

public class program {
    public static void main(String[] args) {
        int a = 4;
        int b = 10;
        int c = 2;
        int d = 1;
        int x = a;
        while (x != b) {
            if (x > b) {
                System.out.println("Такого решения нету");
                break;
            } else {
                if ((b % x == 1) && (b - x != 1)) {
                    x = multiply(x, c);
                    System.out.println(x + " first");
                } else {
                    x = summa(x, d);
                    System.out.println(x + " second");
                }
            }
        }
    }


    private static int summa(int x, int d) {
        return x + d;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }
}
