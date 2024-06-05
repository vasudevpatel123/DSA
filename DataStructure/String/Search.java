package com.vasudev.m1.june5;

class StringCharacterSearchByIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Vasudev Patel";
		int pos = 3;
		char c = characterOfStringAtPosition(str,pos);
		System.out.println("Character in string at position "+pos+" is "+c+".");
	
		
	}
	
	static char characterOfStringAtPosition(String str,int p){
		
		char c = str.charAt(p);
		return c;
		
	}

}
