package com.collections.array;

public class Test {
	
	public static void distanceLoop(int[] arr, int d){
		for(int i=0; i<d; i++){
			leftRotate(arr, arr.length);
		}
	}
	
	public static void leftRotate(int[] arr, int l){
		int temp = arr[0];
		for(int i=0; i<l-1; i++){
			arr[i] = arr[i+1];
		}
		arr[l-1] = temp;
	}
		
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int d=2;
		distanceLoop(arr, d);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}

}
