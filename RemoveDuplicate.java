package week3.day1;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String str = "“We learn java basics as part of java sessions in java week1";
		String[] s1=str.split(" ");
		for(int i = 0; i<s1.length;i++)
		{

			for(int j = i+1; j< s1.length;j++)
			{
				if(s1[i].equals(s1[j])) 
						{
						s1[j]=" ";
						}
			}
		
		System.out.print(" "+s1[i]); //remove ln to display in same line
		}
	}



}