import java.util.Scanner;

public class EvenOdd {
    
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num <= 0) {
            // System.out.println("Invalid number, try it again." + num);
            throw new IllegalArgumentException("Invalid number " + num);
        }else {
            if (num % 2 == 0) {
                System.out.println(num + " Is a even number.");
            }else {
                System.out.println(num + " Is a odd number");
            }
        }
    }
}
