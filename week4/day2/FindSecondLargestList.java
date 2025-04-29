package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestList {

	public static void main(String[] args) {
		int[] arr1 = {3, 2, 11, 4, 6, 7};
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			list.add(arr1[i]);
		}
		System.out.println("The list is: "+list);
		Collections.sort(list);
		System.out.println("The sorted list is: "+list);
		System.out.println("The second largest number in the list is: "+list.get(list.size()-2));
	}
}
