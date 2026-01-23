package com.tree.avltree.gamingapp;

//AVL Tree Node
class AVLNode {
 int key;
 int height;
 AVLNode left, right;

 AVLNode(int key) {
     this.key = key;
     this.height = 1; // new node height = 1
 }
}
