public class Hanoi {
    public static void main(String[] args) {
        Hanoi tower = new Hanoi();
        tower.Towers("1", "3", "2", 4);
    }

    private void Towers(String with, String on, String some, int count) {
        if (count > 1) Towers(with, some, on, count - 1);
        System.out.printf("%S >> %S %n", with, on);
        if (count > 1) Towers(some, on, with, count - 1);

    }
}