package stack3;

import java.util.Scanner;

public class stackApp {

	public static void main(String[] args) {

		StackX s1 = new StackX(10);

		Scanner scanner = new Scanner(System.in);

		int input;

		for (int i = 0; i < 10; i++) {
			System.out.print("Enter a number :");
			input = scanner.nextInt();
			s1.push(input);
		}

		int[] Array = s1.getStackArray();
		System.out.println("\nInputed Array\n");

		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i] + " ");
		}
		System.out.println();

		StackX evenStack = new StackX(10);
		int value;

		while (!s1.isEmpty()) {
			value = s1.pop();

			if (value % 2 == 0) {
				evenStack.push(value);
			} else {
				System.out.println("Number is odd : " + value);
			}
		}
	}
}
