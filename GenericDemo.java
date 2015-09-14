package com.psl.generic;

public class GenericDemo<type> {

	type obj;
	public GenericDemo(type obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}
	
	public type getObj() {
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericDemo<String> o1 = new GenericDemo<String>(new String ("Persistent"));
		
		GenericDemo<Integer> o2 = new GenericDemo<Integer>(new Integer(10));
		
		System.out.println(o1.getObj());
		System.out.println(o2.getObj());
		
		Integer i = new Integer(100); // Wrapper for Int
		
		int i1 = 100;
		
		System.out.println(i.toString());
		System.out.println(i);
	}

}
