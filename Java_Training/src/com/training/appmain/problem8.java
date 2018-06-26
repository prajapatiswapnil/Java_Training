package com.problems;

public class problem8 {

	public static void main(String[] args) {
		
		int arr[] = { 2, -4, 6, -3, 9 };		
		int result;

		result = solution(arr);
		System.out.println(result);
	}

	public static int solution(int[] A) {
		
		if (A.length <= 1) {System.out.println("More than two input required."); return 0;}
		int len = A.length;
		int result = 0;
		int slice = 0;
		slice = ++A[0];
		for (int p = 0; p < len; p++) {
			for (int j = p; j < len; j++) {
				result = result + A[j];
				slice = slice > Math.abs(result) ? Math.abs(result) : slice;
			}
			result = 0;
		}
		return slice;
	}
}