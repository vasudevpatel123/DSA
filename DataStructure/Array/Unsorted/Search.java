package com.vasudev.m1.june2;

class UnsortedArraySearch {

	static int findElement(int arr[],int n, int k) {
		
		for(int i=0;i<n;i++) {
			if(arr[i]==k) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,2,3,4,5,6,7,8,9,10};
		int n = arr.length;
		int key = 90;
		
		
		int position = findElement(arr,n,key);
		
		if(position == -1) {
			System.out.println("Element is not present in the array!");
		}else {
			System.out.println("Element is present at location : "+position);
		}
	}

}
