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

	/**level order traversal or BFS
	 * @param node
	 */
	public void BFSorLevelOrderTraversal(Node node) {
		
		if(node!=null && node.left!=null){
			System.out.println(node.left.key);
			System.out.println(getSibling(node)!=null?getSibling(node).key:"");
			
			BFSorLevelOrderTraversal(node.left);
			BFSorLevelOrderTraversal(node.right);
		}
	}

	/**pre order traversal or DFS
	 * @param node
	 */
	public void DFS_PreOrderTraversal(Node node) {
		
		if(node!=null && node.left!=null){
			System.out.println(node.left.key);
			//System.out.println(getSibling(node)!=null?getSibling(node).key:"");
			
			DFS_PreOrderTraversal(node.left);
			//DFS_PreOrderTraversal(node.right);
		}
		
		if(node!=null && node.right!=null){
			System.out.println(node.right.key);
			DFS_PreOrderTraversal(node.right);
		}
	}
	
	/**In order traversal or DFS
	 * @param node
	 */
	public void DFS_InOrderTraversal(Node node) {
		
		if(node!=null && node.left==null){
			System.out.println(node.key);
		}else if(node!=null && node.left!=null){
			//System.out.println(getSibling(node)!=null?getSibling(node).key:"");
			
			DFS_InOrderTraversal(node.left);
			System.out.println(node.key);
		} 
		
		if(node!=null && node.right!=null){
			System.out.println(node.right.key);
		}
	}
	
	/**Post order traversal or DFS
	 * @param node
	 */
	public void DFS_PostOrderTraversal(Node node) {
		
		if(node!=null && node.left==null){
			System.out.println(node.key);
		}else if(node!=null && node.left!=null){
			//System.out.println(getSibling(node)!=null?getSibling(node).key:"");
			
			DFS_PostOrderTraversal(node.left);
			System.out.println(getSibling(node)!=null?getSibling(node).key:"");
			System.out.println(node.key);
		} 
		
		/*if(node!=null && node.right!=null){
			System.out.println(node.right.key);
		}*/
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

	public Node getSibling(Node parentNode) {
		return parentNode.right;
	}
	/*
	 * public Node getParentNode(Node node){ parentNode }
	 */

	public static void main(String[] args) {
		BinaryTree bTree = new BinaryTree();
		Node root = bTree.root;
		bTree.addNode();
		bTree.addNode();
		//System.out.println(root.key);
		bTree.DFS_PostOrderTraversal(root);
		System.out.println("Height of the tree:"+bTree.height(bTree.root));
	}
}
