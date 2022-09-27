package com.core.type;

public class Program5
{
	public static void main(String[] args)
	{
		
		String strBoolean = "true";
		boolean success = Boolean.parseBoolean(strBoolean);
		System.out.printf("Boolean	:	%b\n\n", success);	//true
		
		String strByte = "123";
		byte num1 = Byte.parseByte(strByte);
		System.out.printf("Byte	:	%d\n\n", num1 );
		
		String strCharacter = "A";
		char ch = strCharacter.charAt(0);		//Look Here
		System.out.printf("Char	:	%c\n\n", ch);
		
		String strShort = "12345";
		short num2 = Short.parseShort(strShort);
		System.out.printf("Short	:	%d\n\n", num2);
		
		String strInteger = "1234567";
		int num3 = Integer.parseInt(strInteger);
		System.out.printf("Integer	:	%d\n\n", num3);
		
		String strLong = "123456789";
		long num4 = Long.parseLong(strLong);
		System.out.printf("Long	:	%d\n\n", num4);
		
		String strFloat = "12345.67";
		float num5 = Float.parseFloat(strFloat);
		System.out.printf("Float	:	%f\n\n", num5);
		
		String strDouble = "1234567.80";
		double num6 = Double.parseDouble(strDouble);
		System.out.printf("Double	:	%f\n\n", num6);
	}
}
