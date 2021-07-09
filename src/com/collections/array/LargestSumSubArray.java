package com.collections.array;

public class LargestSumSubArray {
	
	public static void main(String[] args) {
		
		int[] arr = {-1,-2,-3,4,1,-10,25,5};
		
		int maxSum=0;
		for(int i=0; i<arr.length; i++){
			
			int sum=0;
			for(int j=i; j<arr.length; j++){
				sum = sum+arr[j];
				if(maxSum<sum){
					maxSum = sum;
				}
			}
		}
		System.out.println(maxSum);
		
	}
}
