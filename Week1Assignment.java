import java.util.Scanner;

public class Week1Assignment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        harryAge();
        samAverage();
        calculator(sc);
        triangleArea(sc);
        intOperation(sc);
        doubleOperation(sc);
        chocolateDistribution(sc);
        simpleInterest(sc);
        weightConversion(sc);
        handshake(sc);

        sc.close();
    }

    // 1️⃣ Harry Age
    public static void harryAge() {
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in 2024 is " + age);
    }

    // 2️⃣ Sam Average
    public static void samAverage() {
        int maths = 94, physics = 95, chemistry = 96;
        double average = (maths + physics + chemistry) / 3.0;
        System.out.println("Sam’s average mark in PCM is " + average);
    }

    // 3️⃣ Basic Calculator
    public static void calculator(Scanner sc) {
        System.out.println("\n--- Calculator ---");

        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of "
                + number1 + " and " + number2 + " is "
                + add + ", " + sub + ", " + mul + ", and " + div);
    }

    // 4️⃣ Triangle Area
    public static void triangleArea(Scanner sc) {
        System.out.println("\n--- Triangle Area ---");

        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is "
                + areaIn + " and sq cm is " + areaCm);
    }

    // 5️⃣ Integer Operations
    public static void intOperation(Scanner sc) {
        System.out.println("\n--- Integer Operations ---");

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        System.out.println("The results of Int Operations are "
                + result1 + ", " + result2 + ", "
                + result3 + ", and " + result4);
    }

    // 6️⃣ Double Operations
    public static void doubleOperation(Scanner sc) {
        System.out.println("\n--- Double Operations ---");

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.println("The results of Double Operations are "
                + result1 + ", " + result2 + ", "
                + result3 + ", and " + result4);
    }

    // 7️⃣ Chocolate Distribution
    public static void chocolateDistribution(Scanner sc) {
        System.out.println("\n--- Chocolate Distribution ---");

        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int eachChild = chocolates / children;
        int remaining = chocolates % children;

        System.out.println("The number of chocolates each child gets is "
                + eachChild + " and the number of remaining chocolates are "
                + remaining);
    }

    // 8️⃣ Simple Interest
    public static void simpleInterest(Scanner sc) {
        System.out.println("\n--- Simple Interest ---");

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        double si = principal * rate * time / 100;

        System.out.println("The Simple Interest is " + si
                + " for Principal " + principal
                + ", Rate of Interest " + rate
                + " and Time " + time);
    }

    // 9️⃣ Weight Conversion
    public static void weightConversion(Scanner sc) {
        System.out.println("\n--- Weight Conversion ---");

        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        double kg = pounds / 2.2;

        System.out.println("The weight of the person in pounds is "
                + pounds + " and in kg is " + kg);
    }

    // 🔟 Handshake Program
    public static void handshake(Scanner sc) {
        System.out.println("\n--- Handshake Calculation ---");

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int handshakes = (n * (n - 1)) / 2;

        System.out.println("The maximum number of possible handshakes is "
                + handshakes);
    }
}