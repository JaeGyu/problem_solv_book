package chap0;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Code02 {
	private Code02 code02;
	
	public int max_arr(int[] arr) {
		int maxa;
		maxa = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxa) {
				maxa = arr[i];
			}
		}
		return maxa;
	}
	
	@Before
	public void setUp() throws Exception{
		code02 = new Code02();
	}
	
	@Test
	public void testMax_Arr() throws Exception {
		int[] arr = {2,3,4,55,6,7,8,1};
		assertEquals(55, code02.max_arr(arr));
	}

}
