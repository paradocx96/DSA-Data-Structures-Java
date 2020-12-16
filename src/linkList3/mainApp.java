package linkList3;

public class mainApp {

	public static void main(String[] args) {
		
		// create a new list
				LinkList theList = new LinkList();

				// insert four items
				theList.insertFirst("Smith");
				theList.insertFirst("Toby");
				theList.insertFirst("Jenny");
				theList.insertFirst("Jhon");
				theList.insertFirst("Anne");
				
				System.out.println("====================");
				theList.displayList();
				System.out.println("====================");

				Link P1 = LinkList.first.next;
				Link P2 = P1.next.next;			
				
				LinkList.first.next = P1.next;
				P1.next = null;
				LinkList.first.next.next = P1;
				
				
				
				
//				P1.next.next = LinkList.first;				
//				LinkList.first.next = P2;				
//				LinkList.first = P2.next;				
//				LinkList.first.next = P1;				
//				P2.next = null;
				
				
				
				System.out.println("====================");
				theList.displayList();
				
				// delete item one by one
//				while(!theList.isEmpty()) { 
//					Link aLink = theList.deleteFirst();
//					System.out.print("Deleted ");
//					aLink.displayDetalis();
//				}
	}

}
