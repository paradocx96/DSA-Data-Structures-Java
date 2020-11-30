package linkList2;

public class Link {
	
	public String Name;
	public Link next;
	public double average;
	
	public Link(String name, double avg) {
		Name = name;
		average = avg;
		next = null;
	}
	
	public void displayDetalis() {
		System.out.println(Name + " : " + average);
	}
}
