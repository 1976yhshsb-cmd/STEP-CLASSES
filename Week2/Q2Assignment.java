import java.util.Scanner;

public class Q2Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        armstrong(sc);
        countDigits(sc);
        bmi(sc);
        harshad(sc);
        abundant(sc);

        sc.close();
    }

    static void armstrong(Scanner sc) {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int original = num, sum = 0;

        while (num != 0) {
            int d = num % 10;
            sum += d * d * d;
            num /= 10;
        }

        System.out.println(original + (sum == original ? " is Armstrong" : " is NOT Armstrong"));
    }

    static void countDigits(Scanner sc) {
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int count = 0;

        while (n != 0) {
            n /= 10;
            count++;
        }

        System.out.println("Digits: " + count);
    }

    static void bmi(Scanner sc) {
        System.out.print("Enter weight (kg): ");
        double w = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double h = sc.nextDouble();

        h = h / 100;
        double bmi = w / (h * h);

        System.out.println("BMI = " + bmi);
    }

    static void harshad(Scanner sc) {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int temp = n, sum = 0;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println(n % sum == 0 ? "Harshad Number" : "Not Harshad");
    }

    static void abundant(Scanner sc) {
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }

        System.out.println(sum > n ? "Abundant Number" : "Not Abundant");
    }
}