package search;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SearchTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void linearSeacrhTest() {
		int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
		int arrLen = arr.length;
		
		// search 45 in array
		int index = Search.linearSearch(arr, arrLen, 45); // it returns the one less value than actual index
		assertEquals(4,index); 
		
		//search 50 in array
		index = Search.linearSearch(arr, arrLen, 50); // return -1 , when element not found
		assertEquals(-1,index);
	}
	
	
	
	@Test
	public void binarySeacrhTest() {
		int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
		int arrLen = arr.length;
		
		//in binary search, array is sorted and then element is searched. 
		//sorted array {6 , 7, 9, 13, 21, 45, 101, 102}
		
		// search 45 in array
		int index = Search.binarySearch(arr, arrLen, 45); // it returns the one less value than actual index
		assertEquals(6,index); 
			
		//search 50 in array
		index = Search.binarySearch(arr, arrLen, 50); // return -1 , when element not found
		assertEquals(-1,index);
	}

}
