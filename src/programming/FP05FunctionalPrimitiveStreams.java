package programming;

import java.math.BigInteger;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FP05FunctionalPrimitiveStreams {

	public static void main(String[] args) {
		
		System.out.println(IntStream.range(1, 10).sum());
		
		IntStream.iterate(1, e-> e+2).limit(10).peek(System.out::println).sum();
		
		//factorial of  first 10
		System.out.println(IntStream.rangeClosed(1, 10).reduce(1,(x,y) ->x*y));
		
		//factorial of  first 20
		
		System.out.println(LongStream.rangeClosed(1, 20).reduce(1,(x,y) ->x*y));
		
		//factorial of  first 50
		
		System.out.println(LongStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,BigInteger::multiply));


	}

}
