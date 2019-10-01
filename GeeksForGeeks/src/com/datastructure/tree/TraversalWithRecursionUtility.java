package com.datastructure.tree;

public class TraversalWithRecursionUtility {


	/**level order traversal or BFS
	 * @param node
	 */
	public void BFSorLevelOrderTraversal(Node node) {
		if(node!=null && node.left!=null){
			System.out.println(node.left.key);
			System.out.println(BinaryTree.getSibling(node)!=null?BinaryTree.getSibling(node).key:"");
			
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
			System.out.println(BinaryTree.getSibling(node)!=null?BinaryTree.getSibling(node).key:"");
			System.out.println(node.key);
		} 
		
		/*if(node!=null && node.right!=null){
			System.out.println(node.right.key);
		}*/
	}
	
	public static void main(String[] args) {
		BinaryTree bTree = new BinaryTree();
		Node root = bTree.root;
		bTree.addNode();
		bTree.addNode();
		
		TraversalWithRecursionUtility traversalUtility = new TraversalWithRecursionUtility();
		
		System.out.println("****BFSorLevelOrderTraversal****");

		System.out.println(root.key);
		traversalUtility.BFSorLevelOrderTraversal(root);
		System.out.println("****DFS_PostOrderTraversal****");

		traversalUtility.DFS_PostOrderTraversal(root);
		
		System.out.println("****DFS_InOrderTraversal****");

		traversalUtility.DFS_InOrderTraversal(root);
		System.out.println("****DFS_PreOrderTraversal****");

		traversalUtility.DFS_PreOrderTraversal(root);

		System.out.println("Height of the tree:"+bTree.height(bTree.root));
	}
}
