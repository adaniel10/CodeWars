package com.fdmgroup.codewars;

public class Chocolate {
	
	public static int breakChocolate(int n, int m) {
		return (n == 0) || (m == 0) ? -1 : (n * m) - 1;
	}
}
