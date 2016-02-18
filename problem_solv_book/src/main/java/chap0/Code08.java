package chap0;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Code08 {

	public void right_rotate(int[] arr, int s, int t) {
		int i, last;

		last = arr[t];
		for (i = t; i > s; i--) {
			arr[i] = arr[i - 1];
		}
		arr[s] = last;
	}

	
	@Test
	public void testRight_rotate() throws Exception {
		int[] arr = {1,2,3,4,5,6,7,8};
		this.right_rotate(arr, 2, 6);
		int[] expectArr = {1,2,7,3,4,5,6,8};
	    assertArrayEquals(expectArr, arr);
	} 
}
