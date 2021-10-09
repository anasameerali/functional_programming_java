package programming;

import java.util.stream.IntStream;

public class FP05FunctionalThreads {

	public static void main(String[] args) {
		Runnable runanable =() ->{
			IntStream.range(0,1000).forEach(i -> System.out.println(Thread.currentThread().getId()+ ": "+i));
		};
		Thread thread1 = new Thread(runanable);
		Thread thread2 = new Thread(runanable);
		Thread thread3 = new Thread(runanable);
		thread1.start();
		thread2.start();
		thread3.start();
	}
	
	

}
