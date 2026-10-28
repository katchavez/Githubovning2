package se.iths.katherine.gitexercise;

public class Main {

    public static int maxA(int a, int b) {
        return Math.max(a, b);
    }

    public static int maxB(int a, int b) {
        return Math.max(a, b);
    }

    public static long roundA(double a) {
        return Math.round(a);
    }

        static void main() {

        IO.println(maxA(4, 9));
        IO.println(maxB(4, 9));

        IO.println(roundA(3.4));

    }
}
