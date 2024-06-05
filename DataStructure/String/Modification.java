package com.vasudev.m1.june5;

class ModifyCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String originalString = "I love doding";
		int pos = 7;
		char c = 'c';
		
		System.out.println("Original String : "+originalString+".");
		
		String newString = originalString.substring(0, pos) + c +
						originalString.substring(pos + 1);
		
		System.out.println("New String will be : "+newString+".");
		
	}

}
