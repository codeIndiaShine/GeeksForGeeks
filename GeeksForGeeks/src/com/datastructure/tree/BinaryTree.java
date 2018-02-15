package com.datastructure.tree;

public class BinaryTree {

	Node root;

	public BinaryTree() {
		root = new Node(1);
	}

	public void addNode() {
		if (root.left == null) {
			root.left = new Node(2);
			root.left.left = new Node(4);
			root.left.left.left = new Node(5);
			root.left.left.right = new Node(6);
		} else if (root.right == null)
			root.right = new Node(3);
		
	}

	
	public int height(Node node) {
		if (node==null || node.left == null)
			return 1;
		else {
			int leftHeight = height(node.left);
			int rightHeight = height(node.right);

			if (leftHeight > rightHeight) {
				leftHeight++;
				return leftHeight;
			} else {
				rightHeight++;
				return rightHeight;
			}
		}
	}

	public static Node getSibling(Node parentNode) {
		return parentNode.right;
	}
	/*
	 * public Node getParentNode(Node node){ parentNode }
	 */

	
}
