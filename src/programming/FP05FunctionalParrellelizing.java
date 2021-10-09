package programming;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class FP05FunctionalParrellelizing {

	public static void main(String[] args) {
		Long time0 = System.currentTimeMillis();
		System.out.println(LongStream.range(1, 10000000000L).mapToObj(BigInteger::valueOf).reduce(BigInteger.ZERO,BigInteger::add));
		System.out.println(System.currentTimeMillis()-time0);//405573 ms
		Long time1 = System.currentTimeMillis();
		System.out.println(LongStream.range(1, 10000000000L).parallel().mapToObj(BigInteger::valueOf).reduce(BigInteger.ZERO,BigInteger::add));
		System.out.println(System.currentTimeMillis()-time1);//155976 ms
	}

}
