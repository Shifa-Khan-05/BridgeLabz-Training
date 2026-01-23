package com.tree.musicapp;

public class Main {
   
	public static void main(String[] args) {
		MusicAppBST app=new MusicAppBST();
		
		app.insert(new Music(1, "abc"));
		app.insert(new Music(4, "msndn"));
		app.insert(new Music(6, "sd"));
		app.insert(new Music(2, "345tyhgf"));
		app.insert(new Music(8, "sdfg"));
		
		System.out.println("Searching music with id 3");
		Music m=app.search(3);
		if(m!=null)
		{
			System.out.println(" Found " + m.musicId + " name " + m.musicId);
		}
		else {
			System.out.println("Music not found");
		}
	}
	
} 
