package week4.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {
		int[] arr1 = {3, 2, 11, 4, 6, 7};
		int[] arr2 = {1, 2, 8, 4, 9, 7};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> equals = new ArrayList<Integer>();
		for(int i=0; i<arr1.length;i++) {  // add both arrays into two new lists
			list1.add(arr1[i]);
			list2.add(arr2[i]);
		}
		System.out.println("list1 "+list1);
		System.out.println("list2 "+list2);
		for(int i=0; i<list1.size()-1;i++) {  // iterate list1
			for(int j=0; j<list2.size()-1;j++) { // iterate list1
				if(list1.get(i)==list2.get(j)) { // compare each value of list1 with each value of list2
					equals.add(list1.get(i));  // add equal value to a new list
					//break;
				}
			}
		}
		System.out.println("The equal values in both lists are: "+equals);  // display the oist having equal value
	}
}
