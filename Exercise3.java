/* 3. Write a program which incorporates a method sort to ‘sort by exchange’ the elements of an array. An appropriate program to sort six numbers of type int into ascending order
*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		System.out.println("Enter 6 different integers to sort");
		Scanner reader = new Scanner(System.in);
		int[] sortArray = new int[6];
		int swap;
		boolean check = false; 
		
		
	
		for(int i = 0; i < sortArray.length; i++) {
			sortArray[i] = reader.nextInt();
		}
		
		for(int i = 0; i < sortArray.length; i++) {
			for(int j = 1; j < i; j++) {
				if(sortArray[i] < sortArray[j]) {
					swap = sortArray[j];
					sortArray[j] = sortArray[i];
					sortArray[i] = swap;
				}
			}
		}
		
		for(int i = 0; i < sortArray.length; i++) {
			System.out.print(sortArray[i] + ", ");
		}
		
		
	}
}