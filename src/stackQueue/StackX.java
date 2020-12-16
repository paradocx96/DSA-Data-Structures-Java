package stackQueue;

public class StackX {
	
	private int top, maxSize;
	private int[] stackArray;
	
	public StackX(int s) {
		top = -1;
		maxSize = s;
		stackArray = new int[maxSize];
	}	
	
	public void push(int j) {
		if(top == maxSize-1) {
			System.out.println("Stack is Full!");
		} else {
			stackArray[++top] = j;
			System.out.println("Stack Added!");
		}
	}

	public int pop() {
		if(top == -1) {
			System.out.println("Stack is Empty!");
			return '+';
		} else {
			return stackArray[top--];
		}
	}

	public int peek() {
		if(top == -1) {
			System.out.println("Stack is Empty!");
			return '+';
		} else {
			return stackArray[top];
		}
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			System.out.println("Stack is not Empty!");
			return true;
		} else {
			System.out.println("Stack is Empty!");
			return false;
		}
	}

	/*public boolean isEmpty() {

		return (top == -1);
	}*/

	public boolean isFull() {

		return (top == maxSize-1);
	}
	
	public void displayArray() {
		System.out.println(stackArray);
	}
	
	public int[] getyArray() {
		return stackArray;
	}
	
	public int getSize() {
		return stackArray.length;
	}
}
