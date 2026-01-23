package com.tree.avltree.onlineticketbooking;


//AVL Tree Node
class AVLNode {
 Event event;
 int height;
 AVLNode left, right;

 AVLNode(Event event) {
     this.event = event;
     this.height = 1;
 }
}
