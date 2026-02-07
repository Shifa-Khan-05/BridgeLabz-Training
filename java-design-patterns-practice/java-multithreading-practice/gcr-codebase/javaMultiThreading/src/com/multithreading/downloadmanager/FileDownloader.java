package com.multithreading.downloadmanager;

import java.util.Random;

public class FileDownloader  extends Thread{
	
	String filename;
	private Random random =new Random();
	
	public FileDownloader(String filename) {
		this.filename=filename;
	}
	@Override
	public void run()
	{
	try {
		for(int i=0;i<=100;i+=25)
		{
			System.out.println( Thread.currentThread().getName() +  " downloading the file : " + filename + "->" + i + "%" );
		   Thread.sleep(500 + random.nextInt(1000));
		}
		
	} catch (Exception e) {
		System.out.println("File was inturrpted to download  !!!!");
	}	
	}

}
