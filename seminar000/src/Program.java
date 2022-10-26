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


public class Program {
    static void solve(int s, int e, int p, int m) {
        int[] ways = new int[e + p];
        ways[s] = 1;
//        for (int item = s + 1; item <= e; item++) {
//            if (item % 2 == 0)
//                ways[item] = ways[item - 1] + ways[item / 2];
//            else
//                ways[item] = ways[item - 1];
        for (int i = s + 1; i <= e; i++) {
            ways[i] = i % 2 == 0 ? ways[i - p] + ways[i / m] : ways[i - p];
        }

        for (int way : ways) {
            System.out.print(way + " ");
        }
    }

    static int f(int s, int e, int p, int m) {
        if (e == s) return 1;
        else if (e % m == 0) return f(s, e - p, p, m) + f(s, e / m, p, m);
        else  return f(s, e - p, p, m);

    }

    public static void main(String[] args) {
        //solve(2, 11, 1, 2);
        System.out.println(f(2, 11, 1, 2));
    }
}