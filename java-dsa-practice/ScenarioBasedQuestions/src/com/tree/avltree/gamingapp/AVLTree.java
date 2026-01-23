package com.tree.avltree.gamingapp;

//AVL Tree Class
class AVLTree {

 private AVLNode root;

 //  Get height of node
 int height(AVLNode node) {
     return node == null ? 0 : node.height;
 }

 //  Get balance factor
 int getBalance(AVLNode node) {
     return node == null ? 0 : height(node.left) - height(node.right);
 }

 // Right rotation (LL case)
 AVLNode rightRotate(AVLNode y) {
     AVLNode x = y.left;
     AVLNode T2 = x.right;

     x.right = y;
     y.left = T2;

     // Update heights
     y.height = Math.max(height(y.left), height(y.right)) + 1;
     x.height = Math.max(height(x.left), height(x.right)) + 1;

     return x;
 }

 //  Left rotation (RR case)
 AVLNode leftRotate(AVLNode x) {
     AVLNode y = x.right;
     AVLNode T2 = y.left;

     y.left = x;
     x.right = T2;

     // Update heights
     x.height = Math.max(height(x.left), height(x.right)) + 1;
     y.height = Math.max(height(y.left), height(y.right)) + 1;

     return y;
 }

 //  Insert node
 public void insert(int key) {
     root = insertRec(root, key);
 }

 private AVLNode insertRec(AVLNode node, int key) {

     // 1️⃣ Normal BST insertion
     if (node == null)
         return new AVLNode(key);

     if (key < node.key)
         node.left = insertRec(node.left, key);
     else if (key > node.key)
         node.right = insertRec(node.right, key);
     else
         return node; // duplicates not allowed

     // 2 Update height
     node.height = 1 + Math.max(height(node.left), height(node.right));

     //3  Get balance
     int balance = getBalance(node);

     // 4️ Rotation cases

     // LL Case
     if (balance > 1 && key < node.left.key)
         return rightRotate(node);

     // RR Case
     if (balance < -1 && key > node.right.key)
         return leftRotate(node);

     // LR Case
     if (balance > 1 && key > node.left.key) {
         node.left = leftRotate(node.left);
         return rightRotate(node);
     }

     // RL Case
     if (balance < -1 && key < node.right.key) {
         node.right = rightRotate(node.right);
         return leftRotate(node);
     }

     return node;
 }

 // 🔹 Inorder Traversal (Sorted Order)
 public void inorder() {
     inorderRec(root);
     System.out.println();
 }

 private void inorderRec(AVLNode node) {
     if (node != null) {
         inorderRec(node.left);
         System.out.print(node.key + " ");
         inorderRec(node.right);
     }
 }
}
