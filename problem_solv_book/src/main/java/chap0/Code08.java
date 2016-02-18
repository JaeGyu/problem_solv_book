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

	public void left_rotate(int[] arr, int s, int t) {
		int first = arr[s];

		for (int i = s; i < t; i++) {
			arr[i] = arr[i + 1];
		}
		arr[t] = first;
	}

	public void right_roate_N(int[] arr, int s, int t, int n) {
		int cnt = t - s + 1;
		int toIndexingNum = n % cnt;
		int[] temp = Arrays.copyOf(arr, arr.length);

		for (int i = s; i <= t; i++) {
			arr[(i + toIndexingNum > t) ? toIndexingNum + i - t : toIndexingNum
					+ i] = temp[i];
		}

	}

	@Test
	public void testRight_rotate() throws Exception {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		this.right_rotate(arr, 2, 6);
		int[] expectArr = { 1, 2, 7, 3, 4, 5, 6, 8 };
		assertArrayEquals(expectArr, arr);
	}

	@Test
	public void testLeft_rotate() throws Exception {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] expectArr = { 1, 3, 4, 5, 6, 7, 2, 8 };
		this.left_rotate(arr, 1, 6);

		assertArrayEquals(expectArr, arr);

	}

	@Test
	public void testRightRotateN() throws Exception {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] expectArr = { 1, 3, 2, 4, 5, 6, 7, 8 };

		this.right_roate_N(arr, 1, 2, 3);

		assertArrayEquals(expectArr, arr);
	}

	@Test
	public void testRightRotateN_2() throws Exception {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] expectArr = { 1, 3, 4, 5, 2, 6, 7, 8 };

		this.right_roate_N(arr, 1, 4, 3);

		assertArrayEquals(expectArr, arr);
	}

}
