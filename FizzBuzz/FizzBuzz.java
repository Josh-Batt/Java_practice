import java.util.Scanner;

class FizzBuzz {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Number: ");
        int num = reader.nextInt();

        String fizz = "Fizz";
        String buzz = "Buzz";


        if (num % 5 == 0 && num % 3 == 0)
            System.out.println(fizz + buzz);
        else if (num % 5 == 0)
            System.out.println(fizz);
        else if (num % 3 == 0)
            System.out.println(buzz);
        else if (num % 5 != 0 && num % 3 != 0)
            System.out.println(num);
    }
}
