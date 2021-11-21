import java.util.Scanner;

class TempDay {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Whats the temperature: ");
        int temp = reader.nextInt();
        
        if (temp > 30) {
            System.out.println("Its hot today!");
            System.out.println("Drink lots of water");
        }
        else if (temp > 20)
            System.out.println("Great day");
        else 
            System.out.println("Cold day");
    }
}
