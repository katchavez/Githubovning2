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

    public static long roundB(double b) {
        return Math.round(b);
    }

    public static int parseIntA(String a) {
        return Integer.parseInt(a);
    }

    public static int parseIntB(String b) {
        return Integer.parseInt(b);
    }

    public static double parseDoubleB(String b) {
        return Double.parseDouble(b);
    }

        static void main() {

        IO.println(maxA(4, 9));
        IO.println(maxB(4, 9));

        IO.println(roundB(3.6));
        IO.println(roundA(3.4));

        IO.println(parseIntA("42") + 8);
        IO.println(parseIntB("42") + 8);

        IO.println(Double.parseDouble("12.5"));

    }
}
