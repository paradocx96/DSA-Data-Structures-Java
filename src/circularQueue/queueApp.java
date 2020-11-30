package circularQueue;

public class queueApp {

	public static void main(String[] args) {

		QueueX queueX = new QueueX(10);

		queueX.insert(10);
		queueX.insert(15);
		queueX.insert(28);
		queueX.insert(36);

		System.out.println("\nRemoved item : " + queueX.remove());
		System.out.println("\nPeek Front : " + queueX.peekFront() + "\n");
		
		queueX.insert(45);
		queueX.insert(58);
		queueX.insert(69);
		queueX.insert(69);

		System.out.println("\n" + queueX.peekFront() + "\n");

		while (!queueX.isEmpty()) {
			int temp = queueX.remove();
			System.out.println("Removed item : " + temp);
		}

		System.out.println();
		System.out.println("\n" + queueX.peekFront() + "\n");
	}
}
