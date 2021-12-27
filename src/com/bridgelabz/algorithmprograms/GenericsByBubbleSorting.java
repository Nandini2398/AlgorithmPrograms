package com.bridgelabz.algorithmprograms;

public class GenericsByBubbleSorting {
		public static void main(String[] args) {
			
			BubbleSorting sort = new BubbleSorting();
			String sentence = "Hi,Welcome,to,Bridgelabz";
			String array[] = sentence.toLowerCase().split( ",");
			sort.bubbleSorting(array);
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
			public<K extends Comparable<K>> K bubbleSort(K [] array) {
			K temp =null;
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length - i - 1; j++) {
					if (array[j].compareTo(array[j + 1]) > 0) {
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
			return temp;
		}
	}