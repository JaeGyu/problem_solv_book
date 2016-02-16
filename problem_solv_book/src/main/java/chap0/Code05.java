package chap0;

import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

public class Code05 {
	public void wrong_swap(int a,int b){
		int temp;
		temp = a;
		a = b;
		b = temp;
	}
	
	public void swap(AtomicInteger a, AtomicInteger b){
		a.set(b.getAndSet(a.get()));
	}
	
	@Test
	public void testWrong_swap() throws Exception {
		this.wrong_swap(1, 2);
	}
	
	@Test
	public void testSwap() throws Exception {
		AtomicInteger a = new AtomicInteger(1);
		AtomicInteger b = new AtomicInteger(2);
		this.swap(a, b);
		
		System.out.println(a);
		System.out.println(b);
	}
}
