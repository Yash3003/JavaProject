package com.hcl.java;

public class EvenOdd {

	public void check(int n)
	{
		if(n%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
	public static void main(String[] args) {
		int n=45;
		new EvenOdd().check(n);

	}

}
