package org.forLoopConcepts;

public class ForLoopConcept8 {

	public static void main(String[] args) {
		//output    * 
		//					* *  
		//					* * * 
		//					* * * *
		//					* * * * *
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
}
