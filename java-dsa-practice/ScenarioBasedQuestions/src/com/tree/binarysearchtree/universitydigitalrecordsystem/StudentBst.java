package com.tree.binarysearchtree.universitydigitalrecordsystem;

public class StudentBst {
	 private TreeNode root;

	    // 🔹 Insert student
	    public void insert(Student student) {
	        root = insertRec(root, student);
	    }

	    private TreeNode insertRec(TreeNode root, Student student) {
	        if (root == null) {
	            return new TreeNode(student);
	        }

	        if (student.rollNo < root.student.rollNo) {
	            root.left = insertRec(root.left, student);
	        } else if (student.rollNo > root.student.rollNo) {
	            root.right = insertRec(root.right, student);
	        }

	        return root;
	    }

	    // 🔹 Search student by roll number
	    public Student search(int rollNo) {
	        TreeNode node = searchRec(root, rollNo);
	        return node != null ? node.student : null;
	    }

	    private TreeNode searchRec(TreeNode root, int rollNo) {
	        if (root == null || root.student.rollNo == rollNo) {
	            return root;
	        }

	        if (rollNo < root.student.rollNo) {
	            return searchRec(root.left, rollNo);
	        }

	        return searchRec(root.right, rollNo);
	    }

	    // 🔹 Delete student
	    public void delete(int rollNo) {
	        root = deleteRec(root, rollNo);
	    }

	    private TreeNode deleteRec(TreeNode root, int rollNo) {
	        if (root == null) return root;

	        if (rollNo < root.student.rollNo) {
	            root.left = deleteRec(root.left, rollNo);
	        } else if (rollNo > root.student.rollNo) {
	            root.right = deleteRec(root.right, rollNo);
	        } else {
	            // Node with one child or no child
	            if (root.left == null)
	                return root.right;
	            else if (root.right == null)
	                return root.left;

	            // Node with two children
	            TreeNode successor = minValueNode(root.right);
	            root.student = successor.student;
	            root.right = deleteRec(root.right, successor.student.rollNo);
	        }

	        return root;
	    }

	    private TreeNode minValueNode(TreeNode node) {
	        TreeNode current = node;
	        while (current.left != null) {
	            current = current.left;
	        }
	        return current;
	    }

	    // 🔹 Display students in sorted order
	    public void displayInOrder() {
	        inorderRec(root);
	    }

	    private void inorderRec(TreeNode root) {
	        if (root != null) {
	            inorderRec(root.left);
	            System.out.println(
	                "Roll No: " + root.student.rollNo +
	                ", Name: " + root.student.name +
	                ", Dept: " + root.student.department
	            );
	            inorderRec(root.right);
	        }
	    }
}
