package com.hcl.java;

public class CtoF {
	
	public void calc(double c){
		double k;
		k=c+273;
		System.out.println("Kelvin value " +k);
	}

	public static void main(String[] args) {
		double c=37;
		CtoF obj=new CtoF();
		obj.calc(c);

	}

}
