package com.inheritance.multilevelinheritance.onlineretailmanagement;

//Subclass extending ShippedOrder
class DeliveredOrder extends ShippedOrder {

 String deliveryDate;

 // Constructor
 DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
     super(orderId, orderDate, trackingNumber);
     this.deliveryDate = deliveryDate;
 }

 @Override
 String getOrderStatus() {
     return "Order Delivered on " + deliveryDate;
 }
}

