// Declare loop control variable inside the for
class ForVar {
	public static void main(String args[]) {
		int sum = 0;
		int fact = 1;
		
		// compute the factorial of the numbers through 5
		for (int i = 1; i <= 5; i++) {
			sum += i; // i is known thorughout the loop
			fact *= i;
		}
		
		// but, i is not knwow here
		
		