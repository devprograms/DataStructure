package com.collections.array;

public class LargestSubarraySum {
	
	public static void solution(int[] arr){
		int sum=0;
		int maxsum=0;
		for(int i=0; i<arr.length; i++){
			
			sum=sum+arr[i];
			
			if(maxsum<sum){
				maxsum=sum;
			}
			if(sum<0){
				sum=0;
			}
		}
		System.out.println("maxsum "+maxsum);
		
	}
	
	public static void main(String[] args) {
		int[] arr1 = {-1,-2,-5,6,8,2};
		int[] arr2 = {2,4,-6,-6,-3};
		int[] arr3 = {-2,-3,4,-1,-2,1,5,-3};
		solution(arr1);
	}

}
