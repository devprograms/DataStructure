package com.collections.array;

public class ArrayRotation {
	
	public static void leftRotate(int[] arr, int d){
		for(int i=0; i<d; i++){
			rotate(arr);
		}
	}
	
	public static void rotate(int[] arr){
		int temp = arr[0];
		for(int i=0;i<arr.length-1; i++){
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int d=1;
		leftRotate(arr, d);
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
		}
		
	}

}
