package com.vasudev.m1.june2;

class ArrayUnsortedC2InsertEnd {

	static int insertionOfElement(int arr[],int n,int capacity, int key) {
		
		if(n>=capacity)
			return n;
		
		arr[n]=key;
		
		return n+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 34,6,8,33,90,5,2,45,79 };
		int n = 8;
		int capacity = 200;
		int key = 100;
		
		System.out.println("Before Insertion : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		n = insertionOfElement(arr,n,capacity,key);
		
		System.out.println(" ");
		System.out.println("After Insertion : ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
