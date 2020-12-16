package linkList3;

public class Link {
	
	public String iData;
	public Link next;
	
	public Link(String data) {
		iData = data;
		next = null;
	}
	
	public void displayDetalis() {
		System.out.print(iData + ".");
	}
}
