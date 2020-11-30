package binaryTree2;

public class mainApp {

	public static void main(String[] args) {
		
		Tree T1 = new Tree();
		
		T1.insert(149, "Sri Lanka");
		T1.insert(150, "USA");
		T1.insert(160, "China");
		T1.insert(130, "Russia");
		T1.insert(155, "London");
		
		System.out.println("InOrder");
		T1.TraverseInOrder();
		System.out.println();
		
		System.out.println("PreOrder");
		T1.TraversePreOrder();
		System.out.println();
		
		System.out.println("PostOrder");
		T1.TraversePostOrder();
		System.out.println();
		
		T1.find(160);
		
		T1.deleteAll();
	}
}
