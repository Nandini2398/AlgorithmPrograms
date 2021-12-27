package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

public class FindyourNumber {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please select any number in mind");
			System.out.print("Enter the upper range : ");
			int range = scan.nextInt();
			FindyourNumber number1 = new FindyourNumber();
			number1.findNumber(0, range);
		}
		public void findNumber(int low, int high) {
			Scanner scan = new Scanner(System.in);
			int mid = (low + high) / 2;
			System.out.println("Enter a number");
			System.out.println("1)Greater than "+mid);
			System.out.println("2)Less than "+mid);
			System.out.println("3)Equal to "+mid);
			int choice = scan.nextInt();
			switch(choice) {
			case a:
				if(high - mid == 1) {
					findNumber(high, high);
					break;
				}
				findNumber(mid, high);
				break;
			case b: 
				System.out.println(" final number");
				return;
			case c:
				findNumber(low, mid);
				break;
			default:
				System.out.println(" Enter valid number: ");
			}
		}
	}
