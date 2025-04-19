package week3.day2;

public class ReverseOddIndexWords {

	public static void main(String[] args) {
		String s = "I am a software tester";
		String[] arrS = s.split(" ");
		String revOdd = "";
		for(int i=0;i<arrS.length;i++)
		{
		if(i%2==1)
		{
			for(int j=arrS[i].length()-1;j>=0;j--)
			{
				revOdd = revOdd+arrS[i].charAt(j); //m am; 
			}
			System.out.print(revOdd+" "); // ma ; 
			revOdd = "";
		}
		else
		{
			revOdd = arrS[i];
			System.out.print(revOdd+" ");
			revOdd="";
		}
		}
	}
}