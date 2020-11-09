public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("30 + 15 = " + new Calculator().add(30,15) + ".");
        System.out.println("30 - 15 = " + new Calculator().subtract(30,15) + ".");
        System.out.println("30 x 15 = " + new Calculator().multiply(30,15) + ".");
        System.out.println("30 / 15 = " + new Calculator().divide(30,15) + ".");
    }
}
