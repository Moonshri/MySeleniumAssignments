package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingUsingCollection {
	
	public static void main(String[] args) {
		String[] strArr = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		Arrays.sort(strArr);  // sort the string array values
		List<String> listSort = new ArrayList<String>();  // create an empty list to add string values in reverse order
		for(int i=strArr.length-1; i>=0; i--) {
			listSort.add(strArr[i]);   // add all string array values to list array
		}
		System.out.println("reversed list is "+listSort);
	}
	
	

}
