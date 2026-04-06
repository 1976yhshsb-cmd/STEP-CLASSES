import java.util.Scanner;

public class Q1Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        divisibleBy5(sc);
        smallestOfThree(sc);
        largestOfThree(sc);
        naturalSum(sc);
        voting(sc);
        numberType(sc);

        sc.close();
    }

    static void divisibleBy5(Scanner sc) {
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Is the number " + n + " divisible by 5? " + (n % 5 == 0));
    }

    static void smallestOfThree(Scanner sc) {
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Is first smallest? " + (a < b && a < c));
    }

    static void largestOfThree(Scanner sc) {
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        System.out.println("First largest? " + (a > b && a > c));
        System.out.println("Second largest? " + (b > a && b > c));
        System.out.println("Third largest? " + (c > a && c > b));
    }

    static void naturalSum(Scanner sc) {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int sum = n * (n + 1) / 2;
            System.out.println("Sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println(n + " is not a natural number");
        }
    }

    static void voting(Scanner sc) {
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18)
            System.out.println("Can vote");
        else
            System.out.println("Cannot vote");
    }

    static void numberType(Scanner sc) {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n > 0) System.out.println("Positive");
        else if (n < 0) System.out.println("Negative");
        else System.out.println("Zero");
    }
}