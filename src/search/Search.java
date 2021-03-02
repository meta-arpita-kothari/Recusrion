package search;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Design a class “Search” to search for an element in an array 
 * using recursion following strategy 
 * - Linear Search
 * - Binary Search
 * 
 */
public class Search {

	/**
	 * Linear search - sequentially checks each element of the array for the
	 * target value until a match is found or until all the elements have been
	 * searched.
	 * 
	 * @param arr
	 *            array to be searched
	 * @param left
	 *            index value from the start of array to be searched
	 * @param right
	 *            index value from the end of array to be searched
	 * @param ele
	 *            element to be searched
	 * @return int value - index where element is found or -1 if not found
	 */
	private static int linearSearchUtility(int[] arr, int left, int right,
			int ele) {

		if (right < left) // if element is not found in whole array, return -1
			return -1;

		if (arr[left] == ele) // if element found from left side, return index
			return left;

		if (arr[right] == ele) // if element found from right side, return index
			return right;

		return linearSearchUtility(arr, left + 1, right - 1, ele); // continue
																	// search,
		// if element not
		// found
	}

	/**
	 * Binary search finds the position of a target value within a sorted array.
	 * compares the target value to the middle element of the array. If they are
	 * not equal, the half in which the target cannot lie is eliminated and the
	 * search continues on the remaining half, again taking the middle element
	 * to compare to the target value, and repeating this until the target value
	 * is found.
	 * 
	 * @param arr
	 *            array to be searched , which is sorted
	 * @param left
	 *            index value from the start of array to be searched
	 * @param right
	 *            index value from the end of array to be searched
	 * @param ele
	 *            element to be searched
	 * @return int value - index where element is found or -1 if not found
	 */
	private static int binarySearchUtility(int[] arr, int left, int right,
			int ele) {
		// restrict boundaries of array to prevent overflow of indices
		if (right >= left) {
			int mid = left + (right - left) / 2;

			// If the element is present at the middle itself
			if (arr[mid] == ele)
				return mid;

			// If element is smaller than mid, then it can only be present in
			// left sub array
			if (arr[mid] > ele)
				return binarySearchUtility(arr, left, mid - 1, ele);

			// Else the element can only be present in right sub array
			return binarySearchUtility(arr, mid + 1, right, ele);
		}

		// We reach here when element is not found in array
		return -1;
	}

	/**
	 * To handle the exception ArrayIndexOutofRangeBound
	 * 
	 * @param arr
	 * @param len
	 * @param ele
	 * @return index value get from linearSearchUtility recursive method
	 */
	public static int linearSearch(int[] arr, int len, int ele) {
		int index = -1;
		// check array index out of range exception
		if (len == arr.length - 1)
			index = Search.linearSearchUtility(arr, 0, len, ele);
		else
			index = Search.linearSearchUtility(arr, 0, len - 1, ele);

		// modify the index value to user understandable value
		if (index != -1)
			return index + 1;

		return index;
	}

	/**
	 * To handle the exception ArrayIndexOutofRangeBound
	 * 
	 * @param arr
	 * @param len
	 * @param ele
	 * @return index value get from binarySearchUtility recursive method
	 */
	public static int binarySearch(int[] arr, int len, int ele) {
		// array is sorted for binary search in ascending order
		Arrays.sort(arr);
		int index = -1;
		// check array index out of range exception
		if (len == arr.length - 1)
			index = Search.binarySearchUtility(arr, 0, len, ele);
		else
			index = Search.binarySearchUtility(arr, 0, len - 1, ele);

		// modify the index value to user understandable value
		if (index != -1)
			return index + 1;

		return index;
	}

	public static void main(String[] args) {
		/*
		 * static input
		 */
		int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 }; // array initialized
		int arrLen = arr.length; // length of array

		Scanner input = new Scanner(System.in);
		boolean flag = true; // for looping while loop

		while (flag) {
			System.out.println("\n\nMENU : \n" + "1. Linear Search \n"
					+ "2. Binary Search \n" + "0. Exit \n");

			System.out.println("Enter your choice: ");
			int choice = input.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Okay, bye!");
				System.exit(1);

			case 1:
				System.out.println("Enter element to be searched: ");
				// num2 = PositiveIntegerException.setInput();
				int ele = input.nextInt();
				int index = Search.linearSearch(arr, arrLen - 1, ele);

				if (index == -1)
					System.out.println("Element not found in the array");
				else
					System.out.println("Element " + ele + " found at index : "
							+ index);
				break;

			case 2:
				System.out.println("Enter element to be searched: ");
				// num2 = PositiveIntegerException.setInput();
				ele = input.nextInt();
				
				// this function will sort the array inside , so pass the original array
				index = Search.binarySearch(arr, arrLen - 1, ele);

				if (index == -1)
					System.out.println("Element not found in the array");
				else
					System.out.println("Element " + ele + " found at index : "
							+ index);
				break;
			default:
				System.out.println("Enter valid choice!!");
			}
		}

		input.close(); // Scanner input closed

	}

}
