package com.hcl.java;

public class Perfect {
	
	public void show(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
			if(sum==n)
			{
				System.out.println("Perfect");
			}
			else
			{
				System.out.println("Not");
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		new Perfect().show(n);

	}

}
