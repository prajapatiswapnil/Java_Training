package com.training.codilityPractice;

import java.util.Arrays;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 9, 3, 9, 3, 9, 7 };
		// int K = 3;

		if (SolutionOddOccurrencesInArray.solution(A) == 0)
			System.out.println("Array is empty");
		else {
			int B = SolutionOddOccurrencesInArray.solution(A);
			System.out.println(B);
		}

	}

}

class SolutionOddOccurrencesInArray {
	public static int solution(int[] A) {

		if (A == null || A.length == 0) {
			System.out.println("Array is empty");
			return 0;
		}

		int len = A.length;
		int value = 0;
		boolean flag = false;

		for (int i = 0; i < len; i++) {
			value = 0;
			for (int j = 0; j < len; j++) {
				if (i != j) {
					if (A[i] == A[j]) {
						flag = false;
						value = 0;
						break;
					} else {
						flag = true;
						value = A[i];
						// break;
					}

				}
			}

			if (flag)
				return value;

		}
		return value;

		// write your code in Java SE 8

	}
}
