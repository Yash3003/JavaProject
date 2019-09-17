package com.hcl.java;

public class Switch2 {
	
	public void check(String opt)
	{
	
	switch(opt.toUpperCase())
	{
	case "INSERT" :
		System.out.println("Insert");
		break;
	case "UPDATE" :
		System.out.println("Update");
		break;
	case "DELETE" :
		System.out.println("Delete");
		break;
	}
}

	public static void main(String[] args) {
		String op="DeLEte";
		new Switch2().check(op);
	}
}
