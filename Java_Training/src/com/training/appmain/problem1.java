package com.problems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class problem1 {

	// Complete the playingWithNumbers function below.

	public static void main(String[] args) throws IOException {
		//int[] arr = { 0, 1, 3, -2, 0, 1, 0, -3, 2, 3 };
		int[] arr = { 0, 1, 3, -2, 0, 1, 0, -3, 2, 3 };
		
		int len = arr.length;
		int p = 0;
		int q = 0;
		int r = 0;
		ArrayList<Integer> trp = new ArrayList<>();
		boolean left = false;
		boolean right = false;

		for (p = 0; p < len; p++) {
			for (q = p + 1; q < len; q++) {

				for (r = q + 1; r < len; r++) {

					if (arr[p] > arr[q] && arr[r] > arr[q]) {

						for (int x = p + 1; x < q; x++) {
							if (arr[x - 1] > arr[x])
								left = true;
							else {
								left = false;
								break;
							}
						}
						for (int x = q + 1; x < r; x++) {
							if (arr[x - 1] < arr[x])
								right = true;
							else {
								right = false;
								break;
							}
						}

						if (left == true && right == true) {
							trp.add(Math.min(arr[p] - arr[q], arr[r] - arr[q]));
							System.out.print(p + " " + q + " " + r);
							System.out.println("\t" + arr[p] + " " + arr[q] + " " + arr[r] + "-> "
									+ Math.min(arr[p] - arr[q], arr[r] - arr[q]));
						}
					}
				}
			}
		}

		// trp.forEach(System.out::println);
		Integer mx = Collections.max(trp);
		System.out.println("Max Value: " + mx);
	}
}