package binaryTree;

public class Tree {

	private Node root;

	public Tree() {
		root = null;
	}

	public void insert(int id, double dd) {

		Node newNode = new Node();
		newNode.iData = id;
		newNode.dData = dd;

		if (root == null) {
			// no node in root
			root = newNode;

		} else {// root occupied

			Node current = root; // start at root
			Node parent;

			while (true) {

				parent = current;

				if (id < current.iData) { // go left

					current = current.leftChild;

					if (current == null) {
						parent.leftChild = newNode;
						return;
					}

				} else {// go right

					current = current.rightChild;

					if (current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	private void inOrder(Node localRoot) {
		if (localRoot != null) {
			inOrder(localRoot.leftChild);
			localRoot.displayNode();
			inOrder(localRoot.rightChild);
		}
	}

	private void preOrder(Node localRoot) {
		if (localRoot != null) {
			localRoot.displayNode();
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}

	private void postOrder(Node localRoot) {
		if (localRoot != null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			localRoot.displayNode();
		}
	}

	public void TraverseInOrder() {
		inOrder(root);
	}

	public void TraversePreOrder() {
		preOrder(root);
	}

	public void TraversePostOrder() {
		postOrder(root);
	}

}
