package queue;

import java.util.Scanner;

public class queueApp {

	public static void main(String[] args) {

		QueueX queueX = new QueueX(5);

		Scanner scanner = new Scanner(System.in);

		int input;

		for (int i = 0; i <= 5; i++) {
			System.out.print("Enter Transaction ID " + i + " : ");
			input = scanner.nextInt();
			queueX.insert(input);
		}

		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);
		int value;

		while (!queueX.isEmpty()) {
			
			value = queueX.remove();
			
			if(value % 2 == 0) {
				evenQueue.insert(value);
			} else {
				oddQueue.insert(value);
			}
		}
		
		System.out.println("\n===== PC1 =====");
		
		while (!evenQueue.isEmpty()) {
			System.out.println("Transaction " + evenQueue.remove());
		}
		
		System.out.println("\n===== PC2 =====");
		
		while (!oddQueue.isEmpty()) {
			System.out.println("Transaction " + oddQueue.remove());
		}
	}
}
