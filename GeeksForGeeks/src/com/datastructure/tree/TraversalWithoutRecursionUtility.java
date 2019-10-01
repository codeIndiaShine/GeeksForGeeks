package com.datastructure.tree;

public class TraversalWithoutRecursionUtility {

	/**level order traversal or BFS
	 * @param node
	 */
	public void BFSorLevelOrderTraversal(Node node) {
		
		System.out.println(node.key);
		while(node.left!=null){
			System.out.println(node.left.key);
			
			if(node.right!=null)
			System.out.println(node.right.key);
			
			node = node.left;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree bTree = new BinaryTree();
		Node root = bTree.root;
		bTree.addNode();
		bTree.addNode();
		
		TraversalWithoutRecursionUtility withoutRecTraverse = new TraversalWithoutRecursionUtility();
		
		withoutRecTraverse.BFSorLevelOrderTraversal(root);
		
		System.out.println("Height of the tree:"+bTree.height(bTree.root));

	}

}
