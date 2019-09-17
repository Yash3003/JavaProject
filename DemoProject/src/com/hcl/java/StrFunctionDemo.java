package com.hcl.java;

public class StrFunctionDemo {

	public static void main(String[] args) {
		String str="Welcome to Java Programming";
		System.out.println("Lenght of string " +str.length());
		System.out.println("Char at 5th position" +str.charAt(6));
		System.out.println("Index of g is " +str.indexOf('g'));
		System.out.println(" " +str.substring(7,16));
		System.out.println("Last occurance of a "+str.lastIndexOf('a'));
		
		String s1="Hello",s2="Hello";
		System.out.println(s1.equals(s2));
		
		String s3="Java", s4="Programming";
		System.out.println(s3.compareTo(s4));
		
		s3="Java";
		s4="Java";
		System.out.println(s3.compareTo(s4));

	}

}
