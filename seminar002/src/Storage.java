public class Storage {


    static int position = 0;
    static int[] storage = new int[11];

    static void clear() {
        position = 0;
        int size = storage.length;
        for (int i = 0; i < size; i++) {
            storage[i] = 0;
        }
    }

    static void print() {
        for (int i = 0; i < storage.length; i++) {
            System.out.printf(storage[i] + " ");
        }
        System.out.println();
    }

    static void shift() {
        for (int i = 0; i <= position; i++) {
            storage[i] = storage[i + 1];
        }
        storage[position] = 0;
        position--;
    }

    static void add(int item) {
        if (position >= storage.length) {
            System.out.println("stack overflow");
            return;
        } else
            storage[position++] = item;
    }

    static int remove() {
        int el = storage[0];
        shift();
        return el;
    }

    public static void main(String[] args) {
        add(2);
        add(3);
        print();
    }
}