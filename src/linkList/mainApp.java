package linkList;

public class mainApp {

	public static void main(String[] args) {
		
		// create a new list
		LinkList theList = new LinkList();

		// insert four items
		theList.insertFirst(23);
		theList.insertFirst(89);
		theList.insertFirst(12);
		theList.insertFirst(55);
		
		 //display the list
		theList.displayList();
		
		// delete item one by one
		while(!theList.isEmpty()) { 
			Link aLink = theList.deleteFirst();
			System.out.print("Deleted ");
			aLink.displayDetalis();
		}
	}

}
