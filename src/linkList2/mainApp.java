package linkList2;

public class mainApp {

	public static void main(String[] args) {
		
		// First way - with Link Class
		Link L1 = new Link("Nipuna", 53.5);
		Link L2 = new Link("Aravinda", 78.0);
		Link L3 = new Link("Prashani", 69.5);
				
		L1.next = L2;
		L2.next = L3;
		
		L1.displayDetalis();
		L1.next.displayDetalis();
		L1.next.next.displayDetalis();
		
		
		// Second way - With LinkList Class
		LinkList linkList = new LinkList();		

		linkList.insertFirst("Prashani", 69.5);
		linkList.insertFirst("Aravinda", 78.0);		
		linkList.insertFirst("Nipuna", 53.5);
		
		linkList.displayList();
		
//		linkList.deleteFirst();		
//		linkList.displayList();
		
		linkList.deleteLink("Aravinda");
		linkList.displayList();
		
	}

}
