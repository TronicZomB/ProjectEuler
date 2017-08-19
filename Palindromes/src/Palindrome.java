
public class Palindrome {
	Palindrome() {
		//empty constructor
	}
	
	/**
	 * This method will return the largest palindrome made from the product of two 3-digit numbers.
	 * 
	 * @return the largest palindrome.
	 */
	public int largestPalindrome() {
		//The largest product of 3-digit numbers will result in a 6-digit answer.
		//Brute force method:
		//	-start with 999, mirror to get 999,999
		//	-check if 999,999 is made of 3-digit integers
		//	- if no, decrement 998, mirror 998,899, check. else return.
		//
		//however 999*999 = 998001
		//therefore first palindrome is 997799 (would reach this in just two iterations of above method).
		
		return 0;
	}
}
