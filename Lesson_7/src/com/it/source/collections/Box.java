package com.it.source.collections;

public class Box<T> {
	private T arr[];
	private int i;
	
	@SuppressWarnings("unchecked")
	public Box() {
		arr = (T[]) new Object[4];
	}
	
	public void add(T t) {
		if (i >= arr.length) {
			@SuppressWarnings("unchecked")
			T[] tmp = (T[]) new Object[arr.length * 2];
			for (int j = 0; j < arr.length; j++) tmp[j] = arr[j];
			arr = tmp;
		}
		arr[i++] = t;
	}
	
	public T get() {
		if (i == 0)
			return null;
		
		return arr[--i];
	} 
	
	public int size() {
		return i;
	} 

}
