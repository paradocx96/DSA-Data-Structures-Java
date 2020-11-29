package stack2;

import java.util.Scanner;

public class stackApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// Get the user input
		System.out.print("Enter an expression : ");
		String str = input.nextLine();

		// Length of the user input string
		int len = str.length();

		StackX st = new StackX(len);

		for (int x = 0; x < len; x++) {
			char ch = str.charAt(x);
			if (ch == '(') {
				st.push(ch);
			} else if (ch == ')') {
				char ch2 = st.pop();

				if (ch2 != '(') {
					System.out.println("Invalid string!");
					return;
				}
			}
		}

		if (st.isEmpty()) {
			System.out.println("Valid String!");
		} else {
			System.out.println("Invalid String!");
		}
	}

}
