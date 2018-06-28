package com.training.appmain;

//This is not working correct
public class problem9 {

	public static void main(String[] args) {
		int[][] arr = { { 0, 1, 9, 3 }, { 7, 5, 8, 3 }, { 9, 2, 9, 4 }, { 4, 6, 7, 1 } };

		System.out.println(solution(arr));

	}

	private static int solution(int[][] arr) {
		int result = 0;
		// TODO Auto-generated method stub
		int n = arr.length;
		int m = arr[0].length;
		int valueToCompare = 0;
		boolean rowMinimumcolMaximum = false;
		boolean colMinimumrowMaximum = false;

		for (int p = 1; p < n - 1; p++) {
			for (int q = 1; q < m - 1; q++) {

				valueToCompare = arr[p][q];

				for (int i = p - 1; i > 0; 	i--) {
					if (valueToCompare < arr[i][q]) {
						for (int j = 0; j < n; i++) {

							if (valueToCompare > arr[p][j]) {
								rowMinimumcolMaximum = true;
							}
						}
					}
				}

				for (int i = p - 1; i <= 0; i--) {
					if (valueToCompare > arr[i][q]) {
						for (int j = 0; j < n; i--) {

							if (valueToCompare < arr[p][j]) {
								colMinimumrowMaximum = true;
							}
						}
					}
				}

				if ((rowMinimumcolMaximum == true) || (colMinimumrowMaximum = true))
					result++;

			}
		}

		return result;
	}

}
