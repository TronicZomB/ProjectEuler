
public class PrimeFactors {
	private static long factor;
	private static long divisor = 2;
	
	PrimeFactors(long value) {
		factor = value;
	}
	
	public long getLargestPrimeFactor() {
		//Algorithm implemented from accepted answer at the link below:
		//http://math.stackexchange.com/questions/389675/largest-prime-factor-of-600851475143
		
		if (factor < divisor) {
			return -1;
		}
		else if (factor == divisor) {
			//done, fall through to return.
			
			/*
			 * having the return statement here would return the default value 
			 * that was at the bottom return anyways.
			 */
		}
		else if (factor%divisor == 0) {
			factor = factor / divisor;
			divisor = 2;
			getLargestPrimeFactor();
		}
		else {
			divisor++;
			getLargestPrimeFactor();
		}
		return factor;
	}
}
