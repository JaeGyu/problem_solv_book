package chap0;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Code07 {

	public void swap_arr(int arr[], int i, int j) {
		int temp;

		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	@Test
	public void testSwap_arr() throws Exception {
		int[] a = {1,2,3,4,5};
		this.swap_arr(a, 0, 3);
		
		System.out.println(Arrays.toString(a));
	}
}
