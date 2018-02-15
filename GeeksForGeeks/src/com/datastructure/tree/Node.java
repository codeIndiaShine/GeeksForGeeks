/**
 * 
 */
package com.datastructure.tree;

/**
 * @author 13597
 *
 */
public class Node {

	int key;
	Node left;
	Node right;
	Node parentNode;
	
	public Node(int item) {
		key = item;
		left = right = null;
		parentNode = null;
		// TODO Auto-generated constructor stub
	}
}
