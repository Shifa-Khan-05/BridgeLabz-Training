package com.inheritance.multilevelinheritance.onlineretailmanagement;

//Subclass extending Order
class ShippedOrder extends Order {

 String trackingNumber;

 // Constructor
 ShippedOrder(int orderId, String orderDate, String trackingNumber) {
     super(orderId, orderDate);
     this.trackingNumber = trackingNumber;
 }

 @Override
 String getOrderStatus() {
     return "Order Shipped (Tracking No: " + trackingNumber + ")";
 }
}
