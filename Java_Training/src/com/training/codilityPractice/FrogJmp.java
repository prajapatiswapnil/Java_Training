package com.training.codilityPractice;

public class FrogJmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X = 11;
		int Y = 50000000;
		int D = 2;
		
		System.out.println(solution(X,Y,D));
	}
	
    public static int solution(int X, int Y, int D) {
		if (X>Y) return 0;
    	return (int) Math.ceil((double)(Y-X)/D);
        // write your code in Java SE 8
		
		
		
    }

}
