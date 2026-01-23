package com.tree.musicapp;

public class MusicNode {
	Music music;
    MusicNode left,right; 
	
	public MusicNode(Music music) {
		this.music=music;
		this.left=null;
		this.right=null;
	}
}
