package com.tree.avltree.onlineticketbooking;

public class EventAVLTree {
	 private AVLNode root;

	    // Get height
	    int height(AVLNode node) {
	        return node == null ? 0 : node.height;
	    }

	    // Get balance factor
	    int getBalance(AVLNode node) {
	        return node == null ? 0 : height(node.left) - height(node.right);
	    }

	    // Right rotation
	    AVLNode rightRotate(AVLNode y) {
	        AVLNode x = y.left;
	        AVLNode t2 = x.right;

	        x.right = y;
	        y.left = t2;

	        y.height = Math.max(height(y.left), height(y.right)) + 1;
	        x.height = Math.max(height(x.left), height(x.right)) + 1;

	        return x;
	    }

	    // Left rotation
	    AVLNode leftRotate(AVLNode x) {
	        AVLNode y = x.right;
	        AVLNode t2 = y.left;

	        y.left = x;
	        x.right = t2;

	        x.height = Math.max(height(x.left), height(x.right)) + 1;
	        y.height = Math.max(height(y.left), height(y.right)) + 1;

	        return y;
	    }

	    // Insert event
	    public void insert(Event event) {
	        root = insertRec(root, event);
	    }

	    private AVLNode insertRec(AVLNode node, Event event) {
	        if (node == null)
	            return new AVLNode(event);

	        if (event.startTime < node.event.startTime)
	            node.left = insertRec(node.left, event);
	        else if (event.startTime > node.event.startTime)
	            node.right = insertRec(node.right, event);
	        else
	            return node; // duplicate times not allowed

	        node.height = 1 + Math.max(height(node.left), height(node.right));

	        int balance = getBalance(node);

	        // LL
	        if (balance > 1 && event.startTime < node.left.event.startTime)
	            return rightRotate(node);

	        // RR
	        if (balance < -1 && event.startTime > node.right.event.startTime)
	            return leftRotate(node);

	        // LR
	        if (balance > 1 && event.startTime > node.left.event.startTime) {
	            node.left = leftRotate(node.left);
	            return rightRotate(node);
	        }

	        // RL
	        if (balance < -1 && event.startTime < node.right.event.startTime) {
	            node.right = rightRotate(node.right);
	            return leftRotate(node);
	        }

	        return node;
	    }

	    // Delete event
	    public void delete(int startTime) {
	        root = deleteRec(root, startTime);
	    }

	    private AVLNode deleteRec(AVLNode node, int startTime) {
	        if (node == null)
	            return node;

	        if (startTime < node.event.startTime)
	            node.left = deleteRec(node.left, startTime);
	        else if (startTime > node.event.startTime)
	            node.right = deleteRec(node.right, startTime);
	        else {
	            if (node.left == null || node.right == null) {
	                AVLNode temp = (node.left != null) ? node.left : node.right;
	                if (temp == null)
	                    node = null;
	                else
	                    node = temp;
	            } else {
	                AVLNode successor = minValueNode(node.right);
	                node.event = successor.event;
	                node.right = deleteRec(node.right, successor.event.startTime);
	            }
	        }

	        if (node == null)
	            return node;

	        node.height = 1 + Math.max(height(node.left), height(node.right));
	        int balance = getBalance(node);

	        // LL
	        if (balance > 1 && getBalance(node.left) >= 0)
	            return rightRotate(node);

	        // LR
	        if (balance > 1 && getBalance(node.left) < 0) {
	            node.left = leftRotate(node.left);
	            return rightRotate(node);
	        }

	        // RR
	        if (balance < -1 && getBalance(node.right) <= 0)
	            return leftRotate(node);

	        // RL
	        if (balance < -1 && getBalance(node.right) > 0) {
	            node.right = rightRotate(node.right);
	            return leftRotate(node);
	        }

	        return node;
	    }

	    private AVLNode minValueNode(AVLNode node) {
	        AVLNode current = node;
	        while (current.left != null)
	            current = current.left;
	        return current;
	    }

	    // Display events in order
	    public void displayUpcomingEvents() {
	        inorder(root);
	    }

	    private void inorder(AVLNode node) {
	        if (node != null) {
	            inorder(node.left);
	            System.out.println(
	                "Event: " + node.event.eventName +
	                ", Start Time: " + node.event.startTime
	            );
	            inorder(node.right);
	        }
	    }
}
