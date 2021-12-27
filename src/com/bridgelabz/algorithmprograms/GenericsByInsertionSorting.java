package com.bridgelabz.algorithmprograms;

public class GenericsByInsertionSorting {
		public static void main(String[] args) {
			InsertionSorting insertion = new InsertionSorting();
			String array[] = {"Hi","Hello", "Welcome","to", "Bridgelabz", "Fellowship"};
			insertion.insertionSorting(array);
			for(int i =0;i<array.length;i++) {
				System.out.println(array[i]);
			}
		}
		public<K extends Comparable<K>> K insertionSort(K [] array) {
			for (int i = 0; i < array.length; i++) {
				K temp = array[i];
				int index = i - 1;
				while(index >= 0 && array[index].compareTo(temp) > 0) {
				array[index + 1] = array[index];
				index--;
				}
				array[index + 1] = temp;
			}
			return null ;
		}
	}