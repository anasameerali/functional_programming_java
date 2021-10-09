package programming;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP05FunctionalFunctionalInterfaces {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		Predicate<Integer> isEvenPredicate = x -> x%2==0;
		Function<Integer, Integer> squareFunction = x -> x * x;
		
		Consumer<Integer> sysoutConsumer = System.out::println;
		BinaryOperator<Integer> sumBinaryOperator = (x,y) -> x + y;
		
		Supplier<Integer> randomIntegerSupplier = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};
		
		UnaryOperator<Integer> unaryOperator = x -> 3 * x;
		
		BiPredicate<Integer, String> binPred =(num,str) -> num >0 && str.length() >5 ; 
		
		BiFunction<Integer, String, String> biFun  =(num,str) -> num+"_"+str ; 
		
		BiConsumer<String, String> biCons = (str1,str2) -> {
			System.out.println(str1+"-"+str2);
		};


	}

}
