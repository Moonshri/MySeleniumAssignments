package week3.day1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		int count=0;
		System.out.println("Enter first word:");
		Scanner sc = new Scanner(System.in);
		String first = sc.next();
		System.out.println("Enter second word:");
		String second = sc.next();
		char f[] = first.toCharArray();
		char s[] = second.toCharArray();
		Arrays.sort(f);
		Arrays.sort(s);
		if(f.length==s.length)
		{
			for(int i=0;i<f.length;i++)
			{
				if(f[i]==s[i])
					count++;
			}
			if(count==f.length)
				System.out.println(first+" and "+second+" are anagrams");
			else
				System.out.println(first+" and "+second+" are not anagrams");
		}
		else
		System.out.println(first+" and "+second+" cannot be anagrams");
	}
}