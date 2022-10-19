public class Hanoi {
    public static void main(String[] args) {
        Hanoi tower = new Hanoi();
        tower.Towers("1", "3", "2", 4);
    }

    private void Towers(String first, String last, String second, int count) {
        if (count > 1) Towers(first, second, last, count - 1);
        System.out.printf("%S >> %S %n", first, last);
        if (count > 1) Towers(second, last, first, count - 1);

    }
}