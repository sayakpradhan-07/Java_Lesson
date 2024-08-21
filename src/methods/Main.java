package methods;

public class Main {
    public static void main(String[] args) {
        int a = 2, b = 5;
        great();
        int ans = average(a, b);
    }
    // static and non-static
    public static void great() {
        System.out.println("Welcome People.");
    }

    public static int average(int a, int b) {
        return a + b / 2;
    }
}
