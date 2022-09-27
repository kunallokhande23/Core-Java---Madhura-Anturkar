package com.core.type;

public class Program3
{
	public static void main(String[] args)
	{
		//String.valueOf is used to convert state of value type // char array into string
		String state = "";
		
		boolean success = true;
		state = String.valueOf(success);
		System.out.printf("Success	:	%s\n\n",state);
		
		byte num1 = 125;
		state = String.valueOf(num1);
		System.out.printf("Num1	:	%s\n\n",state);
		
		short num2 = 1250;
		state = String.valueOf(num1);
		System.out.printf("Num2	:	%s\n\n",num2);
		
		char ch ='S';
		state = String.valueOf(ch);
		System.out.printf("Ch	:	%s\n\n",state);
		
		int num3 = 123456;
		state = String.valueOf(num3);
		System.out.printf("Num3	:	%s\n\n",state);
		
		long num4 = 123456789;
		state = String.valueOf(num4);
		System.out.printf("Num4	:	%s\n\n",state);
		
		float num5 = 123.45f;
		state = String.valueOf(num5);
		System.out.printf("Num5	:	%s\n\n",state);
		
		double num6 = 12345.67;
		state = String.valueOf(num6);
		System.out.printf("Num6	:	%s\n\n",state);
		
		char name[]={'S','a','n','d','e','e','p'};
		state = String.valueOf(name);
		System.out.printf("Name	:	%s\n\n", state);
	}
}
