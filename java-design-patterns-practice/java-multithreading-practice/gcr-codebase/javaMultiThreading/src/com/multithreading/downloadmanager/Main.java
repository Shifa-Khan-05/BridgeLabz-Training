package com.multithreading.downloadmanager;

public class Main {
 public static void main(String[] args)throws InterruptedException {
	FileDownloader pdf=new FileDownloader("Document.pdf");
	FileDownloader jpg=new FileDownloader("Document.jpg");
	FileDownloader video=new FileDownloader("Document.mp4");
	
	pdf.start();
	jpg.start();
	video.start();
	
	pdf.join();
	jpg.join();
	video.join();
	
	System.out.println("All downloads complete ");
}
}
