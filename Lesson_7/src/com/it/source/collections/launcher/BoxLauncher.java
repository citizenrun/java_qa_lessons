package com.it.source.collections.launcher;

import com.it.source.collections.Box;

public class BoxLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();
		System.out.println(box.size());
		
		for (int i = 0; i < 10; i++) {
			box.add(i);
		}
		System.out.println(box.size());
		
		for (int i = 0; i < 10; i++) {
			System.out.println(box.get());
		}
	}

}
