package stackQueue;

public class QueueX {

	private int[] queueArray;
	private int maxSize, nItems, front, rear;

	public QueueX(int s) {
		maxSize = s;
		queueArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public void insert(int j) {
		if (rear == maxSize - 1) {
			System.out.println("Queue is Full!");
		} else {
			queueArray[++rear] = j;
			nItems++;
			System.out.println("Data Added! input number : " + j);
		}
	}

	public int remove() {
		if (nItems == 0) {
			System.out.println("Queue is Empty!");
			return -99;
		} else {
			nItems--;
			return queueArray[front++];
		}
	}
	
	public int peekFront() {
		if (nItems == 0) {
			System.out.println("Queue is Empty!");
			return -99;
		} else {
			return queueArray[front];
		}
		
	}

	public boolean isEmpty() {

		if (nItems == 0) {
			return true;
		} else {
			return false;
		}
	}

//	public boolean isEmpty() {
//
//		return (nItems == 0);
//	}

	public boolean isFull() {
		
		return (nItems == maxSize);

	}
	
	public int[] getyArray() {
		return queueArray;
	}
	
	public int getSize() {
		return queueArray.length;
	}
}
