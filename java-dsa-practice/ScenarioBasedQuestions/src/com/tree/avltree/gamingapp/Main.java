package com.tree.avltree.gamingapp;

public class Main {
	 public static void main(String[] args) {

	        AVLTree tree = new AVLTree();

	        // Insert nodes
	        tree.insert(10);
	        tree.insert(20);
	        tree.insert(30);
	        tree.insert(40);
	        tree.insert(50);
	        tree.insert(25);

	        // Display sorted AVL Tree
	        System.out.println("Inorder Traversal of AVL Tree:");
	        tree.inorder();
	    }
}
