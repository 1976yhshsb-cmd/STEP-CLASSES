import java.util.Scanner;

public class Level1Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        votingArray(sc);
        numberCheck(sc);
        multiplicationTable(sc);
        sumTillZero(sc);
        meanHeight(sc);

        sc.close();
    }

    // 1️⃣ Voting for 10 students
    static void votingArray(Scanner sc) {
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age: ");
            ages[i] = sc.nextInt();

            if (ages[i] < 0)
                System.out.println("Invalid age");
            else if (ages[i] >= 18)
                System.out.println("Can vote");
            else
                System.out.println("Cannot vote");
        }
    }

    // 2️⃣ Positive/Negative/Zero + even/odd
    static void numberCheck(Scanner sc) {
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();

            if (arr[i] > 0) {
                System.out.println(arr[i] % 2 == 0 ? "Positive Even" : "Positive Odd");
            } else if (arr[i] < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }

        if (arr[0] == arr[4]) System.out.println("Equal");
        else if (arr[0] > arr[4]) System.out.println("First greater");
        else System.out.println("Last greater");
    }

    // 3️⃣ Multiplication table (1–10)
    static void multiplicationTable(Scanner sc) {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] table = new int[10];

        for (int i = 1; i <= 10; i++) {
            table[i - 1] = n * i;
            System.out.println(n + " * " + i + " = " + table[i - 1]);
        }
    }

    // 4️⃣ Sum until 0
    static void sumTillZero(Scanner sc) {
        double[] arr = new double[10];
        double total = 0;
        int i = 0;

        while (true) {
            System.out.print("Enter number: ");
            double num = sc.nextDouble();

            if (num <= 0 || i == 10) break;

            arr[i++] = num;
        }

        for (int j = 0; j < i; j++) total += arr[j];

        System.out.println("Total = " + total);
    }

    // 5️⃣ Mean height
    static void meanHeight(Scanner sc) {
        double[] heights = new double[5];
        double sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter height: ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        System.out.println("Mean height = " + (sum / 5));
    }
}