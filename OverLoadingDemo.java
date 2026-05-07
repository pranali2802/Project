class OverloadingDemo {
    static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }
    static double power(double a, double b) {
        return Math.pow(a, b);
    }
    static int abs(int a) {
        return Math.abs(a);
    }
    static double abs(double a) {
        return Math.abs(a);
    }
    public static void main(String[] args) {
        System.out.println("Power (int): " + power(2, 3));
        System.out.println("Power (double): " + power(2.5, 2));
        System.out.println("Absolute (int): " + abs(-10));
        System.out.println("Absolute (double): " + abs(-5.5));
        System.out.println("Math.pow: " + Math.pow(3, 2));
        System.out.println("Math.abs: " + Math.abs(-20));
    } }
