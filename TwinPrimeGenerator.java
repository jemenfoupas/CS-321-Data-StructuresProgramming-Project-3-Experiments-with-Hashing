import java.util.Random;

public class TwinPrimeGenerator {

	public TwinPrimeGenerator() {
		
		
	}
	
	public int getPrime() {
		
		for(int i = 95500; i < 96000; i++) {
			if(isPrime(i) && isPrime(i + 2)) {
				return i + 2;
			}
		}
		
		return 0;
	}
	
	public boolean isPrime(int n1) {
		
		for(int i = 2; i < n1; i++) {
			if(n1 % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
