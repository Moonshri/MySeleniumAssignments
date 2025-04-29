package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementList {
     public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 10, 6, 8};
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> missing = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		System.out.println("The unsorted list is: "+list);
		Collections.sort(list);                           //0, 1, 2, 3, 4, 5, 6
		System.out.println("The sorted list is: "+list); //[1, 2, 3, 4, 6, 8, 10]
		for(int i=0;i<list.size()-1;i++) {
		if(list.get(i)!=list.get(i+1)-1) {
			missing.add(list.get(i)+1);
		}
		}
		System.out.println("The missing values in list is: "+missing);
	}
	
}
