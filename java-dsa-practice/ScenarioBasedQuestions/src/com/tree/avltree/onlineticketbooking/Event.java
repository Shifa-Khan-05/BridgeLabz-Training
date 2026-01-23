package com.tree.avltree.onlineticketbooking;

//Event class
class Event {
 int startTime;      // key for AVL Tree (e.g., 1800 for 6 PM)
 String eventName;

 Event(int startTime, String eventName) {
     this.startTime = startTime;
     this.eventName = eventName;
 }
}
