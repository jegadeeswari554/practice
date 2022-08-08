/*
@Author: Jegadeeswari S
Date : 5/08/2022
Title : switch
Question : Printing arithmetic operators using switch
*/
import java.util.*;
class test
{
	public static void main(String[]args)
	{
		Scanner t = new Scanner(System.in);
		//Reading input
	 	System.out.println("Enter first value: ");
		int val = t.nextInt();

		System.out.println("Enter 2nd value: ");
		int val1 = t.nextInt();
		int num=1;

		//using switch
		switch(num)
		{
			case 1:
			System.out.println("Addition "+ (val+val1));
			//break;
			case 2:
			System.out.println("sub "+ (val-val1));
			//break;
			case 3:
			System.out.println("Multiplication "+ (val*val1));
			//break;
			case 4:
			System.out.println("Division "+ (val/val1));
			break;
			default:
			System.out.println("try again  ");
			}

}
}