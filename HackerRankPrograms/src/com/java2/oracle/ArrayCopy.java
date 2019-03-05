package com.java2.oracle;

import java.util.Scanner;

public class ArrayCopy {
 
	public static void main(String[] args) throws Exception {
		Integer a[] = { 1, 2, 3, 4, 5 };
		System.out.println("enter element to search");
		Scanner scan = new Scanner(System.in);
		int element = scan.nextInt();
		int index = findIndexOfElement(a, element);
 
		if (index >= 0) {
 
			Integer b[] = new Integer[a.length - 1];
			System.arraycopy(a, 0, b, 0, element - 1);
			System.arraycopy(a, element, b, element - 1, a.length - element);
 
			a = new Integer[b.length];
			System.arraycopy(b, 0, a, 0, a.length);
			for (int c : a)
				System.out.println(c);
		} else {
			System.out.println("element not found.....");
		}
	}
 
	private static int findIndexOfElement(Integer[] a, int element) {
		for (int j = 0; j < a.length; j++)
			for (int i = 0; i < a.length; i++) {
				if (a[i] == element) {
					return i;
				}
			}
		return -1;
	}
} 
