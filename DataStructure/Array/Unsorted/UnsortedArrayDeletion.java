package com.vasudev.m1.june4;

public class ArrayUnsortedC1DeleteOperation {

	static int findElement(int arr[],int key, int n) {
		
		for(int i=0;i<n;i++) {
			if(arr[i]==key)
				return i;
		}
		return -1;
		
	}
	
	static int deleteElement(int arr[], int n, int key) {
		
		int pos = findElement(arr,key,n);
		
		if(pos==-1) {
			System.out.println("Element not found");
			return n;
		}else {
			for(int i=pos;i<n-1;i++) {
				arr[i]=arr[i+1];
			}
			return n-1;
		}
			 
		
		
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2,5,3,7,4,9,0,6,1};
		
		int n = arr.length;
		int key = 9;
		
		System.out.println("Array before deletion - ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println(" ");
		n=deleteElement(arr,n,key);
		System.out.println(" ");
		
		System.out.println("Array after Deletion - ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
}
