package org.twoDimentionalArray;

public class FindTheSmallestNumber {

	public static void main(String[] args) {
		int []a = {23,56,23,46,57,68,79};
		int min =a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println(min);
	}
}
