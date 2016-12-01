package com.java.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myList = {1,3,3,5,6};
		/*List<Integer> mylist = new ArrayList<>();
		mylist.add(1);
		mylist.add(3);
		mylist.add(3);
		mylist.add(5);
		mylist.add(6);
		List<Integer> newList = new ArrayList<>();*/
		
		/*Iterator<Integer> it = mylist.listIterator();
		while(it.hasNext()){
			
		}*/
		/*int[] newList = new int[4];
		for(int i=0;i< myList.length;i++){
			int k=0;
			for(int j=i;j<=myList.length;j++){
				if(myList[i]!= myList[j]){
					System.out.println("old list=="+myList[i]);
					newList[k++] = myList[i];
					//System.out.println("new list"+newList[k]);
				}
			}
		}
		
		System.out.println(newList.length);
		for(int i=0;i< newList.length;i++){
			System.out.println(newList[i]);
		}*/
		quickSort(myList, 0, myList.length - 1);
		System.out.println("array with duplicate valies");
		for(int i=0;i< myList.length;i++){
			System.out.println(" "+myList[i]);
		}
		
		int[] newArrays = new int[myList.length];
	    int count = 0;
	    for (int i = 0; i < myList.length - 1; i++) {
	        if (myList[i] != myList[i + 1]) {
	            newArrays[count] = myList[i];
	            count++;
	        }
	    }
	    
	    System.out.println("array length"+newArrays.length);
	    System.out.println("array with unique valies");
		for(int i=0;i< newArrays.length;i++){
			System.out.println(" "+newArrays[i]);
		}
		
}
	
	public static void quickSort(int[] array, int low, int high) {
	    int i = low;
	    int j = high;

	    int pivot = array[low + (high - low) / 2];

	    while (i <= j) {
	        while (array[i] < pivot) i++;
	        while (array[j] > pivot) j--;
	        if (i <= j) {
	            exchange(array, i, j);
	            i++;
	            j--;
	        }
	    }
	    if (0 < j) quickSort(array, 0, j);
	    if (i < high) quickSort(array, i, high);
	}

	public static void exchange(int[] array, int i, int j) {
	    int temp = array[i];
	    array[i] = array[j];
	    array[j] = temp;
	}
}