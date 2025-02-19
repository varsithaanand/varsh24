import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = isPrime(num);

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        scanner.close();
    }

    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;  // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) { // Optimized check
            if (num % i == 0) {
                return false; // If divisible, it's not prime
            }
        }
        return true;
    }
}