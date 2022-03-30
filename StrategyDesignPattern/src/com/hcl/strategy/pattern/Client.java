package com.hcl.strategy.pattern;

public class Client {

	public static void main(String[] args) {

		
		VLCPlayer vlc=new VLCPlayer();
		
		
		MediaContext context=new MediaContext(vlc);
		
		context.executePlayingMediaFile();	
		
		
		Mp3Player mp3=new Mp3Player();
		
		MediaContext mp3Context=new MediaContext(mp3);
		
		mp3Context.executePlayingMediaFile();
		
		
	}

}
