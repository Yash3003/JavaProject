package com.hcl.java;

public class SwitchDemo {
	
	public void show(int dayNo)
	{
		switch(dayNo)
		{
		case 1:
			System.out.println("sunday");
			break;
		case 2 :
			System.out.println("monday");
			break;
		case 3 :
			System.out.println("tuesday");
			break;
		case 4 :
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thrusday");
			break;
		case 6 :
			System.out.println("Friday");
			break;
		case 7 :
			System.out.println("Saturday");
			break;
		default :
			System.out.println("Invalid");
			
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dayNo=5;
		new SwitchDemo().show(dayNo);

	}

}
