// Demonstrate the while loop
class WhileDemo {
	public static void main(String args[]) {
		char ch;

		// print the alphabet using a while loop
		ch = 'a';
		while (ch <= 'z') {
			if (ch != 'z') {
				System.out.print(ch);
			} else {
				System.out.println(ch);
			}
			ch++;
		}
	}
}