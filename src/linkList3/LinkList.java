package linkList3;

public class LinkList {

	public static Link first;

	public LinkList() {
		first = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(String data) {

		// step 1 - create new link
		Link newLink = new Link(data);

		// step 2 - link the newLink with the existing Link list
		newLink.next = first;

		// step 3 - make the newLink as the first link in the link list
		first = newLink;
	}

	public Link deleteFirst() {

		// step 1 - save current reference of the current first to the temp
		Link temp = first;

		// step 2 - change the reference to the next available link
		first = first.next;

		// step 3 - return old(previous) first reference
		return temp;
	}

	public void displayList() {
		Link current = first;
		// Start from the first link of the list

		while (current != null) {
			current.displayDetalis();
			
			//move the current to the next link
			current = current.next;
		}
		System.out.println();
	}
}
