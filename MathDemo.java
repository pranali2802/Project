public class MathDemo {
    static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }
    static double power(double a, double b) {
        return Math.pow(a, b);
    }
    static int absolute(int a) {
        return Math.abs(a);
    }
    static double absolute(double a) {
        return Math.abs(a);
    }
    public static void main(String[] args) {
        System.out.println("Power (int): " + power(2, 3));
        System.out.println("Power (double): " + power(2.5, 2));
        System.out.println("Absolute (int): " + absolute(-10));
        System.out.println("Absolute (double): " + absolute(-5.7));
        System.out.println("\nUsing Math class:");
        System.out.println("Math.pow(3,2) = " + Math.pow(3, 2));
        System.out.println("Math.abs(-20) = " + Math.abs(-20));
    }
}

