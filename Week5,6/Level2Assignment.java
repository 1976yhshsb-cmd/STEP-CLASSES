import java.util.Scanner;

public class Level2Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        bonus(sc);
        youngestTallest(sc);
        reverseNumber(sc);
        bmi(sc);
        gradeSystem(sc);

        sc.close();
    }

    // 1️⃣ Bonus calculation
    static void bonus(Scanner sc) {
        double[] salary = new double[3];
        double totalBonus = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years: ");
            int years = sc.nextInt();

            double bonus = (years > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
            totalBonus += bonus;
        }

        System.out.println("Total Bonus = " + totalBonus);
    }

    // 2️⃣ Youngest & tallest
    static void youngestTallest(Scanner sc) {
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age: ");
            age[i] = sc.nextInt();

            System.out.print("Enter height: ");
            height[i] = sc.nextDouble();
        }

        int minAge = age[0];
        double maxHeight = height[0];

        for (int i = 1; i < 3; i++) {
            if (age[i] < minAge) minAge = age[i];
            if (height[i] > maxHeight) maxHeight = height[i];
        }

        System.out.println("Youngest age = " + minAge);
        System.out.println("Tallest height = " + maxHeight);
    }

    // 3️⃣ Reverse number using array
    static void reverseNumber(Scanner sc) {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] digits = new int[10];
        int i = 0;

        while (num != 0) {
            digits[i++] = num % 10;
            num /= 10;
        }

        System.out.print("Reversed: ");
        for (int j = 0; j < i; j++) System.out.print(digits[j]);
        System.out.println();
    }

    // 4️⃣ BMI
    static void bmi(Scanner sc) {
        System.out.print("Enter weight: ");
        double w = sc.nextDouble();

        System.out.print("Enter height(cm): ");
        double h = sc.nextDouble() / 100;

        double bmi = w / (h * h);

        System.out.println("BMI = " + bmi);
    }

    // 5️⃣ Grade system
    static void gradeSystem(Scanner sc) {
        System.out.print("Enter marks: ");
        double m = sc.nextDouble();

        if (m >= 90) System.out.println("Grade A");
        else if (m >= 75) System.out.println("Grade B");
        else System.out.println("Grade C");
    }
}