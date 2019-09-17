package com.hcl.java;

public class Factor {
	
	public void show(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println("Factor " +i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=50;
		new Factor().show(n);

	}

}
