package stackQueue;

public class Main {

	public static void main(String[] args) {
		
		QueueX myQueue = new QueueX(6);
		StackX myStack = new StackX(6);
		
		myQueue.insert(15);
		myQueue.insert(68);
		myQueue.insert(27);
		myQueue.insert(65);
		myQueue.insert(24);
		myQueue.insert(95);
		
//		System.out.println();
//		int[] myQueuevalues = myQueue.getyArray();		
//		for (int i = 0; i < 6; i++) {
//			System.out.print(myQueuevalues[i] + ",");
//		}
		
		
		while(!myQueue.isEmpty()) {
			myStack.push(myQueue.peekFront());
			System.out.println("Peek : " + myQueue.peekFront());
			myQueue.remove();
		}
		
//		System.out.println();
//		int[] myStackvalues = myStack.getyArray();		
//		for (int i = 0; i < 6; i++) {
//			System.out.print(myStackvalues[i] + ",");
//		}
		
		while(!myStack.isEmpty()) {
			myQueue.insert(myStack.peek());
			System.out.println(myStack.peek());
			myStack.pop();
		}
		
		System.out.println();
		int[] Queuevalues = myQueue.getyArray();		
		for (int i = 0; i < 6; i++) {
			System.out.print(Queuevalues[i] + ",");
		}
	}

}
