import java.text.NumberFormat;
import java.util.Scanner;

class MorgageCalc {
    public static void main(String[] args) {
        // Scanner for input
        Scanner reader = new Scanner(System.in);

        // Inputs
        System.out.print("Home price: ");
        double totalPrice = reader.nextDouble();

        System.out.print("Down payment: ");
        double downPayment = reader.nextDouble();

        System.out.print("Length of loan in years: ");
        double loanLength = reader.nextDouble();

        System.out.print("Annual intrest rate: ");
        double intrestRate = reader.nextDouble();

        // Logic
        double leftPrice = totalPrice - downPayment;
        double oneYearPrice = leftPrice / loanLength;
        double intrestPercent = intrestRate / 100;
        double oneYearPricePlusIntrest = (oneYearPrice * intrestPercent) + oneYearPrice;
        double oneMonthPrice = oneYearPricePlusIntrest / 12 ;
        
        String morgageFormated = NumberFormat.getCurrencyInstance().format(oneMonthPrice);
        System.out.println("Your monthly morgage payment is: " + morgageFormated);
    }
}
