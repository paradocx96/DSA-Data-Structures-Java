package linkList;

public class Link {
	
	public int iData;
	public Link next;
	
	public Link(int id) {
		iData = id;
		next = null;
	}
	
	public void displayDetalis() {
		System.out.println("Data : " + iData);
	}
}
