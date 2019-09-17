package com.hcl.java;

public class PosNeg {
	
	public void check(int n)
	{
		if(n<0)
		{
			System.out.println("Number ids negative");
		}
		else
		{
			System.out.println("Number is positive");
		}
	}

	public static void main(String[] args) {
		int n=25;
		PosNeg obj=new PosNeg();
		obj.check(n);

	}

}
