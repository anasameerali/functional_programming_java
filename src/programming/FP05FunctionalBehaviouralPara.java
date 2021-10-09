package programming;

import java.util.List;
import java.util.function.Predicate;

public class FP05FunctionalBehaviouralPara {

	public static void main(String[] args) {
		List<Integer>numbers  =List.of(1,2,3,4);
		filterAndPrint(numbers,  x -> x%2==0);
		filterAndPrint(numbers, x -> x%2!=0);

	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream().filter(predicate).forEach(System.out::println);
	}

}
