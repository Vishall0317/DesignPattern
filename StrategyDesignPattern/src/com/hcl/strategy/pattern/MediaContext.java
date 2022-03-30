package com.hcl.strategy.pattern;

public class MediaContext {

	private MediaPlayer mediaPlayer;

	public MediaContext(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}

	public void executePlayingMediaFile() {
		mediaPlayer.playFile();
	}
}
