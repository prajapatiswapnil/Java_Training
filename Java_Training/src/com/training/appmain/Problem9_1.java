package com.training.appmain;

//This is working correct
public class Problem9_1 {

	public static void main(String[] args) {
		int[][] arr = { { 0, 1, 9, 3 }, { 7, 5, 8, 3 }, { 9, 2, 9, 4 }, { 4, 6, 7, 1 } };

		System.out.println(solution(arr));

	}

	private static int solution(int[][] arr) {
		int result = 0;
		// TODO Auto-generated method stub
		int n = arr.length;
		int m = arr[0].length;
		boolean loMinlocMax = false;
		boolean locMaxlocMin = false;

		for (int p = 1; p < n - 1; p++) {

			for (int q = 1; q < m - 1; q++) {

				if ((arr[p][q - 1] > arr[p][q] && arr[p][q] < arr[p][q + 1])
						&& (arr[p - 1][q] < arr[p][q] && arr[p][q] > arr[p + 1][q]))
					loMinlocMax = true;
				else
					loMinlocMax = false;

				if ((arr[p][q - 1] < arr[p][q] && arr[p][q] > arr[p][q + 1])
						&& (arr[p - 1][q] > arr[p][q] && arr[p][q] < arr[p + 1][q]))
					locMaxlocMin = true;
				else
					locMaxlocMin = false;
				
				if (loMinlocMax || locMaxlocMin ) {
					result++;
					System.out.println("result: " + result + "	rowMinimumcolMaximum:" + loMinlocMax
							+ "	:locMaxlocMin:" + locMaxlocMin + "	p:q" + p + ":" + q + "	Value:" + arr[p][q]);

				}

				loMinlocMax = false;
				locMaxlocMin = false;

			}
		}

		return result;
	}
}
