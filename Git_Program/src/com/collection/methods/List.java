package com.collection.methods;

import java.util.*;
public class List {
	
	

	public static void main(String[] args) {
		 
		ArrayList arr = new ArrayList();
		arr.add(1);
		arr.add("santosh");
		arr.add(3);
		arr.add(2.34);
		
		System.out.println(arr);
		
		for (Object o : arr) {
		System.out.println("the array list is :" + o);
		}
		
		

	}

}
