package javaapplication8;

class DequeTest {
    int size = 0;
    int s[] = new int[10];

    void putLast(int item) {
        s[size] = item;
        size++;
        System.out.println("");
    }

    void putFirst(int item) {
        for (int i = size - 1; i >= 0; i--) {
            s[i + 1] = s[i];
        }
        s[0] = item;
        size++;
    }

    void pickLast() {

        System.out.println("\nПоследний элемент " + s[size - 1]);
        s[size - 1] = 0;
        size--;
    }

    void pollLast() {
        System.out.println("\nПоследний элемент " + s[size - 1]);
    }

    void pollFirst() {
        System.out.println("\nПервый элемент " + s[0]);
    }

    void pickFirst() {
        System.out.println("\nПервый элемент " + s[0]);
        for (int i = 1; i < s.length; i++) {
            s[i - 1] = s[i];
        }
        size--;

    }

    public void size() {
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }

}

public class JavaApplication8 {
    public static void main(String[] args) {
        DequeTest test = new DequeTest();

        System.out.println("Initial array looks like: ");
        test.putLast(2);
        test.size();
        System.out.println("");

        System.out.println("\nAdd 10 as last element to array: ");
        test.putLast(10);
        test.size();
        System.out.println("");

        System.out.println("\nAdd 8 as first element to array: \n");
        test.putFirst(8);
        test.size();
        System.out.println("");

        System.out.println("\nAdd 9 as first element to array: \n");
        test.putFirst(9);
        test.size();
        test.pickFirst();
        System.out.println("");

        test.size();
        System.out.println("");
        test.pickFirst();
        test.size();
        System.out.println("");

        test.pickLast();
        test.size();
        System.out.println("");
    }

}
