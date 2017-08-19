import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner in = new Scanner(System.in);
		long input = in.nextLong();

		PrimeFactors primeFactor = new PrimeFactors(input);
		long largestPrime = primeFactor.getLargestPrimeFactor();
		
		System.out.print(largestPrime);
	}
}
