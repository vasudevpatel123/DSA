package com.vasudev.m1.june5;

public class StringInsertionAtPosition {

	public static void main(String[] args) {
		
		String str = "Vasudevtel";
		String ch = "Pa";
		int pos = 7;
		
		System.out.println("Before Insertion : "+str);
		stringInsertion(str,ch,pos);
	}
	
	static void stringInsertion(String str,String ch,int pos) {
		
		StringBuilder sb = new StringBuilder(str);
		sb.insert(pos, ch);
		String newString = sb.toString();
		System.out.println("After addition : "+newString);
	
	}
	
}
