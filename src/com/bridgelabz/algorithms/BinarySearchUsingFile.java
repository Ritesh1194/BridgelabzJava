
package com.bridgelabz.algorithms;

/**
 * *****************************************************************************
 * 2. Read in a list of words from File. Then prompt the user to enter a word to
 * search the list. The program reports if the search word is found in the list.
 * 
 * @author : Ritesh Yadav
 * @version : 1.0
 * @since : 15-11-2019
 *
 */
import java.io.*;
import utility.Algorithms;
import utility.Utility;

public class BinarySearchUsingFile {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(
				"/home/bridgelabz/Desktop/Ritesh/Bridgelabz-master/src/com/bridgelabz/algorithms/BinaryFile");
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		String delimitor = ",";
		String[] array = new String[100];
		while ((str = br.readLine()) != null) {
			array = str.split(delimitor);
		}
		Algorithms.bubbleSort(array, array.length);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("Enter the word to be searched from the file list");
		String word = Utility.inputString();
		int i = Algorithms.binarySearchGeneric(array, word);

		if (i >= 0)
			System.out.println("Word is found in the list at the index " + i);
		else
			System.out.println("Word is not found in the list");

		br.close();
	}
}
