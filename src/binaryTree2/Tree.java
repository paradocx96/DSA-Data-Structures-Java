package binaryTree2;

public class Tree {

	private Node root;

	public void insert(int empNo, String name) {
		Node newNode = new Node();

		// assign parameters to Node variables
		newNode.EmpNo = empNo;
		newNode.Name = name;

		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent;

			while (true) {

				parent = current;

				if (empNo < current.EmpNo) {
					current = current.leftChild;

					if (current == null) {
						parent.leftChild = newNode;
						return;
					}

				} else {

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
		if(localRoot != null) {
			inOrder(localRoot.leftChild);
			localRoot.displayNode();
			inOrder(localRoot.rightChild);
		}
	}
	
	public void TraverseInOrder() {
		inOrder(root);
	}
	
	private void preOrder(Node localRoot) {
		if(localRoot != null) {
			localRoot.displayNode();
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}
	
	public void TraversePreOrder() {
		preOrder(root);
	}
	
	private void postOrder(Node localRoot) {
		if(localRoot != null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			localRoot.displayNode();
		}
	}
	
	public void TraversePostOrder() {
		postOrder(root);
	}
	
	private Node findRecursive(Node localRoot, int empNo) {
		
		if(localRoot == null) {
			
			return null;
			
		} else if (localRoot.EmpNo == empNo) {
			
			System.out.println(localRoot.Name);
			return localRoot;
			
		} else if(empNo < localRoot.EmpNo) {
			
			return findRecursive(localRoot.leftChild, empNo);
			
		} else {
			
			return findRecursive(localRoot.rightChild, empNo);
		}
	}
	
	public Node callRecursive(int empNo) {
		return findRecursive(root, empNo);
	}
	
	public Node find(int emp) {
		Node current = root;
		
		while(current.EmpNo != emp) {
			
			if(emp < current.EmpNo) {
				
				current = current.leftChild;
				
			} else {
				
				current = current.rightChild;
			}
			
			if(current == null) {
				return null;
			}
		}
		
		System.out.println(current.Name);
		return current;
	}
	
	
	public void deleteAll() {
		root = null;
	}
	
	public int minimum() { 
        Node current = root; 
  
        while (current.leftChild != null) { 
            current = current.leftChild; 
        } 
        return (current.EmpNo);
    }
	
	public int maximum() { 
		Node current = root; 
		
		while (current.rightChild != null) { 
			current = current.rightChild; 
		} 
		return (current.EmpNo);
	}
	
	private void desendingOrder(Node localRoot) {
		if(localRoot != null) {
			desendingOrder(localRoot.rightChild);
			localRoot.displayNode();
			desendingOrder(localRoot.leftChild);
		}
	}
	
	public void TraverseDesendingOrder() {
		desendingOrder(root);
	}
	
	
}
