package binaryTree2;

public class Node {
	
	public String Name;
	public int EmpNo;
	
	public Node leftChild;
	public Node rightChild;
	
	public void displayNode() {
		System.out.println("Emp No : " + EmpNo + " Name : " + Name);
	}

}
