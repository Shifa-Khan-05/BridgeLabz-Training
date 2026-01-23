package com.tree.musicapp;

public class MusicAppBST {
    MusicNode root;
    
    public MusicNode insert(Music music) {
		return insertID(root,music);
		
	}
    public MusicNode insertID(MusicNode root,Music music) {
    	if (root == null) {
            return new MusicNode(music);
        }
    	
    	if(music.musicId<root.music.musicId)
    	{
    		root.left=insertID(root.left, music);
    	}
    	else if(music.musicId>root.music.musicId)
    	{
    		root.right=insertID(root.right, music);
    	}
    	
    	
    	return root;
	}
    
    public Music search(int musicId) {
    	MusicNode node =searchById(root, musicId);
    	return node!=null ? node.music : null;
		
	}
    public MusicNode searchById(MusicNode root,int musicI) {
    	if(root==null || root.music.musicId==musicI)
    	{
    		return root;
    	}
    	
    	if(musicI<root.music.musicId)
    	{
    		return searchById(root.left, musicI);
    	}
    	
    	return searchById(root.right, musicI);
    }
    
    public void display() {
		
	}
    
    public void inorderId(MusicNode root) {
		if(root!=null)
		{
			inorderId(root.left);
			System.out.println(
					"Music Id : " + root.music.musicId +
					", Name : " + root.music.musicName
					);
			
			inorderId(root.right);
		}
	}
}
