package com.hcl.java;

public class FactNew {
	
	public void calc(int n)
	{
		int f=1;
		for(int i=n;i>=1;i--)
		{
			f=f*i;
		}
		System.out.println(f);
	}

	public static void main(String[] args) {
		int n=5;
		new FactNew().calc(n);

	}

}
