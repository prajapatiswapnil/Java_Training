package com.training.appmain;

public class Problem3 {

	public static void main(String[] args) {

		int a[] = { 0, 1, 2, 2, 3, 5 };
		int b[] = { 500000, 500000, 0, 0, 0, 20000 };

		System.out.println(solution(a, b));

	}

	public static int solution(int[] A, int[] B) {
		int len = A.length;
		float C[] = new float[len];
		int pairs = 0;
		for (int i = 0; i < len; i++) {
			C[i] = (float) (A[i] + B[i] / 1000000.00);
		}

		// for (float x: C) System.out.println(x);

		for (int p = 0; p < len; p++) {
			for (int q = p + 1; q < len; q++) {

				if ((C[p] * C[q]) >= (C[p] + C[q])) {

					if (pairs > 1000000000)
						return 1000000000;
					else
						pairs++;

					// System.out.println("(" + p + "," + q +") " + C[p] + " * " + C[q]+ "=" + C[p]
					// * C[q] + " " + C[p] + " + " + C[q]+ "=" + (C[p]+C[q]));
				}

			}
		}

		return pairs;

	}

}
