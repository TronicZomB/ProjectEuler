
public class EvenFibonacci {
	int n2 = 1; //Nth-2 fib number, initialized to 1
	int n1 = 2; //Nth-1 fib number, initialized to 2
	int n; //Nth fib number
	
	EvenFibonacci() {
		//empty constructor
	}
	
	/**
	 * Add all even Fibonacci numbers less than 4 million
	 */
	public int addEvens() {
		int sum = n1; //initial condition
		
		while (n < (4000000)) {
			n = n1 + n2; //calculate next fib number
			n2 = n1;
			n1 = n;
			
			//is n even?
			if (n%2 == 0) {
				sum += n;
			}
		}
		
		return sum;
	}
}
