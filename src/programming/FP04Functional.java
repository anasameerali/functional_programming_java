package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP04Functional {

	public static void main(String[] args) {
		List<Integer>numbers  =List.of(1,2,3,4);
		List<Integer> squares = squareList(numbers);
		squares.forEach(System.out::println);

	}

	private static List<Integer> squareList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream().map(number -> number*number).collect(Collectors.toList());
	}

}
