package binaryTree;

public class Node {

	public int iData; // data item (used as key value)
	public double dData; //other data
	public Node leftChild; // this node’s left child
	public Node rightChild; //this node’s right child
	
	public void displayNode(){
		System.out.println("{" + iData + ", " + dData + "}");
	}
}
