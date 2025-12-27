package com.constructors.level1;

public class Product {
          
	   String productName;
	   double price;
	   static int totalProduct;
	   public void displayProductDetails() {
		System.out.println("Product name = " + productName);
		System.out.println("Price = " +price);
	}
	   public static void displayTotalProducts() {
		System.out.println("Total products remaing = "+totalProduct);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Product product =new Product();
      product.productName="Bread";
      product.price=50.0;
      totalProduct=56;
      product.displayProductDetails();
      product.displayTotalProducts();
   }

}
