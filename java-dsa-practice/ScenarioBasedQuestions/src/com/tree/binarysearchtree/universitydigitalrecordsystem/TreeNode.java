package com.tree.binarysearchtree.universitydigitalrecordsystem;

public class TreeNode {
	Student student;
    TreeNode left, right;

    TreeNode(Student student) {
        this.student = student;
        left = right = null;
    }
}
