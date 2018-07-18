package com.training.codilityPractice;

public class CyclicRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] A = {3, 8, 9, 7, 6};
		// int K = 3;

		int[] A = null;
		int K = 3;

		if (Solution.solution(A, K) == null)
			System.out.println("Array is empty");
		else {
			int B[] = Solution.solution(A, K);

			System.out.print("[");
			for (int i = 0; i < B.length; i++) {
				System.out.print(B[i]);
				if (i < B.length - 1)
					System.out.print(",");
			}
			System.out.println("]");
		}
	}

}

class Solution {
	public static int[] solution(int[] A, int K) {

		if (A == null || A.length == 0) {
			System.out.println("Array is empty");
			return null;
		}

		int len = A.length;
		int iterator = K;
		int tmp;
		while (iterator > 0) {

			tmp = A[len - 1];
			for (int i = len - 1; i > 0; i--) {

				A[i] = A[i - 1];
				System.out.println(A[i]);
			}

			A[0] = tmp;
			iterator--;
			System.out.println("---------------------------");
		}

		return A;
		// write your code in Java SE 8

	}
}
