package com.hcl.java;

public class MaxThree {
	
	public void check(int a,int b,int c)
	{
		if(a>b&&a>c)
		{
			System.out.println("a is greatest "+a);
		}
		else if(a<b&&b>c)
		{
			System.out.println("b is greatest "+b);
		}
		else
		{
			System.out.println(" c is greatest "+c);
		}
	}

	public static void main(String[] args) {
		int a=6;
		int b=7;
		int c=8;
		new MaxThree().check(a, b, c);

	}

}
