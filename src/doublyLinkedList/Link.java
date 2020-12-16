package doublyLinkedList;

public class Link {
	Node head; // head of list

	/* Doubly Linked list Node */
	class Node {
		int data;
		Node previous;
		Node next;

		// Constructor to create a new node
		// next and previous is by default initialized as null
		Node(int d) {
			data = d;
		}
	}
}
