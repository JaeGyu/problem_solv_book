package chap0;

import static org.junit.Assert.*;

import org.junit.Test;

public class Code01 {

	public int min(int x, int y) {
		if (x < y) {
			return x;
		}
		return y;
	}

	public int max(int x, int y) {
		if (x > y) {
			return x;
		}

		return y;
	}

	public int maxWithThree(int i, int j, int k) {
		return max(max(i, j), k);
	}

	@Test
	public void testMin() throws Exception {
		Code01 code01 = new Code01();
		System.out.println(code01.min(1, 2));
	}

	@Test
	public void testMax() throws Exception {
		Code01 code01 = new Code01();
		System.out.println(code01.max(1, 2));
	}

	@Test
	public void testMaxWithNumThree() throws Exception {
		Code01 code01 = new Code01();
		assertEquals(3, code01.maxWithThree(1, 3, 2));
		assertEquals(3, code01.maxWithThree(3, 1, 2));
	}

}
