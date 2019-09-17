package com.hcl.obj;



public class Agent {
	
	public StringBuilder show(String agentId, String fullName, int maritalStatus, String zipcode)
	{
		StringBuilder sbError=new StringBuilder();
		boolean isValid=true;
		if(!(agentId.charAt(0)=='A'))
		{
			sbError.append("Should start with A"+"\r\n");
			isValid=false;
		}
		if(fullName.indexOf(' ')== -1)
		{
			sbError.append("Full name contains space" +"\r\n");
			isValid=false;
		}
		if(fullName.length()>20)
		{
			sbError.append("Lenght should not be more than 20 characters" +"\r\n");
			isValid=false;
		}
		if(maritalStatus!=0 || maritalStatus!=1)
		{
			sbError.append("Should be either 0 or 1" +"\r\n");
			isValid=false;
		
		}
		if(zipcode.length()!=6)
		{
			sbError.append("Lenght should be 6" +"\r\n");
			isValid=false;
		}
		if(isValid==true)
		{
			sbError.append("Agent Id "+agentId+"\r\n");
			sbError.append("Full Name "+fullName+"\r\n");
			sbError.append("Marital Status "+maritalStatus+"\r\n");
			sbError.append("Zipcode "+zipcode+"\r\n");
		}
		return sbError;
	}	
	public static void main(String[] args) {
		String agentId; 
		String fullName; 
		int maritalStatus; 
		String zipcode;
		agentId="A0000";
		fullName="Yash Mendiratta";
		maritalStatus=3;
		zipcode="GHYT06";
		StringBuilder sbRes= new Agent().show(agentId, fullName, maritalStatus, zipcode);
		System.out.println(sbRes);

		
	}

}
