package linkList2;

public class LinkList {

	private Link first;

	public LinkList() {
		first = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(String name, double avg) {

		// step 1 - create new link
		Link newLink = new Link(name, avg);

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
		System.out.println("List from first link to the last Link");

		Link current = first;
		// Start from the first link of the list

		while (current != null) {
			current.displayDetalis();
			
			//move the current to the next link
			current = current.next;
		}
	}
	
	public Link deleteLink(String name) {
		
		Link current = first;
		Link previous = first;
		
		//checking the name until we find it by going through all links one by one
		while(current.Name != name) {
			
			if (current.next == null) {
				//name is not in the name
				return null;
			} else {
				previous = current;
				current = current.next;
			}// go out of this while loop when the name is found
			
			if(current == first) {
				first = first.next;
			} else {
				previous.next = current.next;
			}
		}
		return current;
	}
}
