package binaryTree;

public class mainApp {

	public static void main(String[] args) {

		Tree T1 = new Tree();

		T1.insert(149, 0.1);
		T1.insert(150, 1.0);
		T1.insert(160, 1.5);
		T1.insert(130, 2.0);
		T1.insert(155, 2.5);

		System.out.println("InOrder");
		T1.TraverseInOrder();
		System.out.println();

		System.out.println("PreOrder");
		T1.TraversePreOrder();
		System.out.println();

		System.out.println("PostOrder");
		T1.TraversePostOrder();
		System.out.println();
	}
}
