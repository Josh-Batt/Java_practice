import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("1st Number: ");
        double num = reader.nextDouble();

        System.out.print("2nd Number: ");
        double num2 = reader.nextDouble();

        double ans = num + num2;

        System.out.print(num + " + " + num2 + " = " + ans);
    }
}
