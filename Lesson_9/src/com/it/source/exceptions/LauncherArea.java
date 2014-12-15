package com.it.source.exceptions;

public class LauncherArea {
	
	public static void main(String[] args) {
		SpaceHulk hulk = new SpaceHulk(100, true, ShuntingEngine.STATE_OK, 100); //new SpaceHulk();
		hulk.start();
		
//		hulk.safeStart();
	}

}
