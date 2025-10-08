class MathUtils {
    public static int add(int a, int b) { return a + b; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }
    public static double divide(int a, int b) { return (double) a / b; }

    public static void main(String[] args) {
        System.out.println("Sum: " + MathUtils.add(10, 20));
        System.out.println("Product: " + MathUtils.multiply(5, 4));
    }
}
