package com.cg.corejava.inheritandpoly;

public abstract class MediaItem extends Item {

	private int runtime;
	
	public MediaItem() {
		this.runtime=0;
	}
	
	public MediaItem(int runtime) {
		this.runtime=runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
}
