import java.util.Scanner;

public class Q3Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        calculator(sc);
        fizzBuzz(sc);
        factors(sc);
        power(sc);
        multiplicationTable(sc);

        sc.close();
    }

    static void calculator(Scanner sc) {
        System.out.print("Enter numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.print("Operator (+,-,*,/): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/': System.out.println(b != 0 ? a / b : "Error"); break;
            default: System.out.println("Invalid");
        }
    }

    static void fizzBuzz(Scanner sc) {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    static void factors(Scanner sc) {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.print(i + " ");
        }
        System.out.println();
    }

    static void power(Scanner sc) {
        System.out.print("Enter number and power: ");
        int n = sc.nextInt(), p = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= p; i++) result *= n;

        System.out.println("Result = " + result);
    }

    static void multiplicationTable(Scanner sc) {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}