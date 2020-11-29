package stack;

public class stackApp {

	public static void main(String[] args) {

		StackX stackX = new StackX(10);

		stackX.push('A');
		stackX.push('B');
		stackX.push('C');
		stackX.push('D');
		stackX.push('E');

		System.out.println(stackX.peek());

		stackX.displayArray();

		while (!stackX.isEmpty()) {
			System.out.println(stackX.pop());
		}

	}
}
