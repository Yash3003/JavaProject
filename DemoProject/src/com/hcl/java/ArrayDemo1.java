package com.hcl.java;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] a=new int[]{12,83,004,115};
		System.out.println("Elements of array are ");
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		// TODO Auto-generated method stub
		for (int i : a) {
			System.out.println(i);
		}
	}

}
