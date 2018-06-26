package com.training.appmain;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Problem4 {

	public static void main(String[] args) {

		int a[] = { 2, 2, 2, 2, 2, 3, 4, 4, 4, 6 };
		// int a[] = { 1, 1, 1, 1, 50 };

		System.out.println(solution(a));
	}

	public static int solution(int[] A) {

		int len = A.length;
		int tmp = A[0];
		int c = 1;
		Map<Integer, Integer> lt = new HashMap<Integer, Integer>();
		Integer aValue = null;

		for (int i = 1; i < len; i++) {
			if (A[i] == tmp) {
				c++;
				lt.put(A[i], c);
			} else {
				c = 1;
				lt.put(A[i], c + 1);
				tmp = A[i];
			}
		}

		int maxCount = (Collections.max(lt.values()));
		for (Entry<Integer, Integer> lp : lt.entrySet()) {
			if (lp.getValue() == maxCount)
				aValue = lp.getKey();
		}

		if (maxCount > (len / 2))
			return aValue.intValue();
		else
			return -1;
	}
}