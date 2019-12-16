package utility;

/** *****************************************************************************
 *	  Purpose: Algorithms Utility class.
 *  @author  :  Ritesh Yadav
 *  @version :  1.2
 *  @since   :  15-11-2019
 *
 ***************************************************************************** */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.algorithms.UserDetails;

public class Algorithms {

	/**
	 * Define static function swap()
	 * 
	 * @param ch
	 *            --> char
	 * @param i
	 *            --> int
	 * @param j
	 *            --> int
	 * @return void
	 */
	public static void swap(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	/**
	 * Define static function permutations()
	 * 
	 * @param ch
	 *            --> char
	 * @param currentIndex
	 *            --> int
	 * @return void
	 */
	public static void permutations(char ch[], int currentIndex) {
		if (currentIndex == ch.length - 1) {
			System.out.println(String.valueOf(ch));
		}

		for (int i = currentIndex; i < ch.length; i++) {
			swap(ch, currentIndex, i);
			permutations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
	}

	/**
	 * Define static function permutations()
	 * 
	 * @param string
	 *            --> String
	 * @return void
	 */
	public static void permutations(String string) {
		List<String> partial = new ArrayList<>();
		partial.add(String.valueOf(string.charAt(0)));

		for (int i = 1; i < string.length(); i++) {
			for (int j = partial.size() - 1; j >= 0; j--) {
				String str = partial.remove(j);
				for (int k = 0; k <= str.length(); k++) {
					partial.add(str.substring(0, k) + string.charAt(i) + str.substring(k));
				}
			}
		}
		System.out.println(partial);
	}

	/**
	 * Define static function BinarySearchGeneric()
	 * 
	 * @param array
	 *            --> Generic type <T>
	 * @param key
	 *            --> Generic type <T>
	 * @return void
	 */
	public static <T extends Comparable<T>> int binarySearchGeneric(T[] array, T key) {
		int low = 0, high = array.length - 1;
		int n = array.length;
		bubbleSort(array, n);
		int mid = (high + low) / 2;
		while (low <= high) {

			if ((key.compareTo(array[mid])) == 0) {
				return mid;
			} else if ((array[mid].compareTo(key)) > 0)
				high = mid - 1;
			else
				low = mid + 1;
			mid = (low + high) / 2;
		}
		return -1;
	}

	/**
	 * Define static function bubbleSort()
	 * 
	 * @param array
	 *            --> Generic type <T>
	 * @param key
	 *            --> int
	 * @return void
	 */
	public static <T extends Comparable<T>> T[] bubbleSort(T[] array, int n) {
		T temp;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

	/**
	 * Define static function permutations()
	 * 
	 * @param array
	 *            [] --> String
	 * @param n
	 *            --> int
	 * @return String
	 */
	public static String[] sort_sub(String array[], int n) {
		String temp = "";
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	/**
	 * Define static function bubbleSort()
	 * 
	 * @param arr
	 *            [] --> int
	 * @param num
	 *            --> int
	 * @return void
	 */
	public static void bubbleSort(int arr[], int num) {
		int i, j;
		for (i = 0; i < num; i++) {
			for (j = 1; j < (num - i); j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(" After Sorted Elements ");
		for (i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	/**
	 * Define static function permutations()
	 * 
	 * @param list
	 *            [] --> String
	 * @return String
	 */
	public static String[] mergeSort(String[] list) {
		String[] sorted = new String[list.length];
		if (list.length == 1) {
			sorted = list;
		} else {
			int mid = list.length / 2;
			String[] left = null;
			String[] right = null;
			if ((list.length % 2) == 0) {
				left = new String[list.length / 2];
				right = new String[list.length / 2];
			} else {
				left = new String[list.length / 2];
				right = new String[(list.length / 2) + 1];
			}
			int x = 0;
			int y = 0;
			for (; x < mid; x++) {
				left[x] = list[x];
			}
			for (; x < list.length; x++) {
				right[y++] = list[x];
			}
			left = mergeSort(left);
			right = mergeSort(right);
			sorted = mergeArray(left, right);
		}

		return sorted;
	}

	/**
	 * Define static function mergeArray()
	 * 
	 * @param left
	 *            --> String
	 * @param right
	 *            -->String
	 * @return String
	 */
	private static String[] mergeArray(String[] left, String[] right) {
		String[] merged = new String[left.length + right.length];
		int lIndex = 0;
		int rIndex = 0;
		int mIndex = 0;
		int comp = 0;
		while (lIndex < left.length || rIndex < right.length) {
			if (lIndex == left.length) {
				merged[mIndex++] = right[rIndex++];
			} else if (rIndex == right.length) {
				merged[mIndex++] = left[lIndex++];
			} else {
				comp = left[lIndex].compareTo(right[rIndex]);
				if (comp > 0) {
					merged[mIndex++] = right[rIndex++];
				} else if (comp < 0) {
					merged[mIndex++] = left[lIndex++];
				} else {
					merged[mIndex++] = left[lIndex++];
				}
			}
		}
		return merged;
	}

	/**
	 * Define static function detectAnagram()
	 * 
	 * @param first
	 *            --> String
	 * @param second
	 *            -->String
	 * @return boolean
	 */
	public static boolean detectAnagram(String first, String second) {

		// If length of both words are not same then they are not anagram.
		if (first.length() != second.length())
			return false;

		for (int i = 0; i < second.length(); i++) {
			char c = first.charAt(i);
			if (second.indexOf(c) == -1)
				return false;
		}
		return true;
	}

	/**
	 * Define static function primeNumber()
	 * 
	 * @return void
	 */
	public static void primeNumber() {

		System.out.println("Prime Number");
		for (int i = 1; i < 1000; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}
	}

	/**
	 * Define static function primeAnagram()
	 * 
	 * @return void
	 */
	public static void primeAnagram() {

		for (int i = 1; i < 1000; i++) {
			for (int j = i + 1; j < 999; j++) {
				int n[] = new int[i];
				int m[] = new int[j];
				if (n.length != m.length) {
					break;
				}
				Arrays.sort(n);
				Arrays.sort(m);
				for (int k = 0; k < n.length; k++) {
					if (n[k] == m[k]) {
						System.out.println(n[k]);
					}
				}
			}
		}
	}

	/**
	 * Define static function linear()
	 * 
	 * @param contents
	 *            --> List<Integer>
	 * @param query
	 *            -->Integer
	 * @return int
	 */
	public static int linear(List<Integer> contents, Integer query) {
		for (int index = 0; index < contents.size(); ++index) {
			if (query.equals(contents.get(index))) {
				return index;
			}
		}
		return -1;
	}

	/**
	 * Define static function swap()
	 * 
	 * @param a
	 *            --> E [] Generic Type
	 * @param i
	 *            -->int
	 * 
	 * @param j
	 *            -->int
	 * 
	 * @return <E> Generic Type
	 */
	public static <E> void swap(E[] a, int i, int j) {
		if (i != j) {
			E temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}

	/**
	 * Define static function selectioSort()
	 * 
	 * @param a
	 *            --> E [] Generic Type
	 */
	public static <E extends Comparable<E>> void selectionSort(E[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			// find index of smallest element
			int smallest = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo(a[smallest]) <= 0) {
					smallest = j;
				}
			}

			swap(a, i, smallest); // swap smallest to front
		}
	}

	/**
	 * Define static function find()
	 * 
	 * @param low
	 *            [] --> int
	 * @param up
	 *            --> int
	 * @return void
	 */
	public static void find(int low, int up) {
		if (low == up) {
			System.out.println("Your number is : " + low);
			System.out.println("Intermediary numbers is " + (low - 1) + " and " + (low + 1));
			return;
		}
		int mid = (low + up) / 2;
		int ch;
		System.out.println("Press 1 : " + low + " - " + mid);
		System.out.println("Press 2 : " + (mid + 1) + " - " + up);
		ch = Utility.inputInteger();
		// Number is in first half
		if (ch == 1) {
			find(low, mid);
		}
		// Number is in second half
		else {
			find(mid + 1, up);
		}
	}

	/**
	 * Define Mesdsage Programs()
	 * 
	 */

	private static final String REGEX_NAME = "<<name>>";
	private static final String REGEX_FULLNAME = "<<full name>> ";
	private static final String REGEX_MOBILE_NO = "xxxxxxxxxx";
	private static final String REGEX_DATE = "19/11/2019";

	static BufferedReader br;
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	public String inputWord() {
		try {
			return bufferedReader.readLine();
		} catch (IOException exception) {
			System.out.println(exception.getMessage());
		}
		return "";
	}

	/**
	 * Define static function getFileText()
	 * 
	 * @param fileName
	 *            [] [] --> String
	 * @return String
	 */

	public static String getFileText(String fileName) {

		try {

			br = new BufferedReader(new FileReader(fileName));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			return sb.toString();
		} catch (Exception exception) {
			return null;
		} finally {
			try {
				br.close();
			} catch (IOException exception) {
			}
		}
	}

	/**
	 * Define static function getFormatedDate()
	 * 
	 * @param date
	 *            --> Date
	 * @return String
	 */
	public static String getFormatedDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(date);
	}

	public static String convertString(UserDetails userDetails, String message) {
		Pattern p = Pattern.compile(REGEX_NAME);
		Matcher m = p.matcher(message);
		message = m.replaceAll(userDetails.getfName());

		p = Pattern.compile(REGEX_FULLNAME);
		m = p.matcher(message);
		message = m.replaceAll(userDetails.getfName() + " " + userDetails.getlName());

		p = Pattern.compile(REGEX_MOBILE_NO);
		m = p.matcher(message);
		message = m.replaceAll(userDetails.mobileNo());

		p = Pattern.compile(REGEX_DATE);
		m = p.matcher(message);
		message = m.replaceAll(userDetails.date());

		return message;
	}
}