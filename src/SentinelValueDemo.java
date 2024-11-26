import java.util.Scanner;

public class SentinelValueDemo {

    public static void main(String[] args) {

        int scannedNumber;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to start adding a running sum; press 0 to exit:");
        scannedNumber = scanner.nextInt();

        while (scannedNumber > 0) {

            sum += scannedNumber;
            System.out.println("Enter another number to add to the running sum; press 0 to exit:");
            scannedNumber = scanner.nextInt();
        }

        System.out.println("The total sum is: " + sum);

    }
}
