/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

/* 
	Define an array and insert element to an array
	Running time = O(n)
*/
class Array
{
	public static void main (String[] args) throws Exception
	{
		Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		printS("Original Array");
		printArray(array);
		
		printS("Origninal Array Length: ");
		printI(array.length);
		
		printS("Insert 0 at position 5");
		insertNewElementToArray(array, 5, 0);
		
		printS("Insert 100 at position 0");
		insertNewElementToArray(array, 0, 100);
		
		printS("Insert 200 at position 10");
		insertNewElementToArray(array, 10, 200);
		
		printS("Original Array");
		printArray(array);
	}
	
	static void printArray(Integer[] array) {
		for(Integer a : array) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
	static void printI(Integer data) {
		System.out.println(data);
	}
	
	static void printS(String data) {
		System.out.println(data);
	}
	
	static void insertNewElementToArray(Integer[] array, Integer position, Integer element) {
		
		Integer[] newArray = new Integer[array.length + 1];
		
		printS("New Array Length: ");
		printI(newArray.length);
		
		newArray[position] = element;
		
		for(int i = 0; i < position; i++) {
			newArray[i] = array[i];
		}

		for(int i = position; i < array.length; i++) {
			newArray[i+1] = array[i];
		}
		
		printArray(newArray);
	}
}
