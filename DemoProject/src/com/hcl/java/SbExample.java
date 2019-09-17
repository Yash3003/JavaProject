package com.hcl.java;

public class SbExample {
	
	public StringBuilder show(int age,String name,String course,String city)
	{
		StringBuilder sbError=new StringBuilder();
		boolean isValid=true;
		/* validation for age*/
		if(age<=20)
		{
			sbError.append("Age must be greater than 20" +"\r\n");
			isValid=false;
		}
		/*Validation of Name*/
		if(name.indexOf(' ')== -1)
		{
			sbError.append("Name must conatin first and last name" +"\r\n");
			isValid=false;
		}
		/*Validation of  Course*/
		if(!course.equalsIgnoreCase("JAVA"))
		{
			sbError.append("Only java is allowed" +"\r\n");
			isValid=false;
		}
		/*Validation of City*/
		if(!city.equalsIgnoreCase("BANGALORE"))
		{
			sbError.append("City must be Bangalore" +"\r\n");
			isValid=false;
		}
		if(isValid==true)
		{
			sbError.append("Age "+age+"\r\n");
			sbError.append("Name "+name+"\r\n");
			sbError.append("Course "+course+"\r\n");
			sbError.append("City "+city+"\r\n");
		}
		return sbError;
	}	
	public static void main(String[] args) {
		int age;
		String name;
		String course;
		String city;
		age=21;
		name="Yash Mendiratta";
		course="Java";
		city="Bangalore";
		StringBuilder sbRes= new SbExample().show(age, name, course, city);
		System.out.println(sbRes);

	}

}
