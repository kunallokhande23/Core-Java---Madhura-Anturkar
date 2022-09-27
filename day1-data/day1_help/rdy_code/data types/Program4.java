package com.core.type;

public class Program4
{
	public static void main(String[] args)
	{		
		System.out.printf("%-25d %-20d\n",Byte.MIN_VALUE,Byte.MAX_VALUE);
		
		System.out.printf("%-20d %-20d\n",Character.MIN_CODE_POINT,Character.MAX_CODE_POINT);
		
		System.out.printf("%-25d %-20d\n",Short.MIN_VALUE,Short.MAX_VALUE);
		
		System.out.printf("%-25d %-20d\n",Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		System.out.printf("%-25d %-20d\n",Long.MIN_VALUE,Long.MAX_VALUE);		
		
		System.out.printf("%-25g %-20g\n",Float.MIN_VALUE,Float.MAX_VALUE);
		
		System.out.printf("%-25g %-20g\n",Double.MIN_VALUE,Double.MAX_VALUE);
	}
}
