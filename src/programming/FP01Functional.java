package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		List<Integer>numbers  =List.of(1,2,3,4);
	//	printAllNumbersInListFunctional(numbers);
		//printEvenNumbersInListFunctional(numbers);
	//	printEvenNumbersInListFunctionalWithLmbda(numbers);
		printSquaresOfEvenNumbersInListFunctionalWithLmbda(numbers);
	}

	private static boolean isEven(int num) {
		return num%2==0;
	}
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream().filter(FP01Functional::isEven).forEach(System.out::println);
	}

	private static void print(int num) {
		System.out.println(num);
	}
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().forEach(FP01Functional::print);
		
	}
	
    private static void printEvenNumbersInListFunctionalWithLmbda(List<Integer> numbers) {
		
		numbers.stream().filter(number ->number%2==0).forEach(System.out::println);
	}

    private static void printSquaresOfEvenNumbersInListFunctionalWithLmbda(List<Integer> numbers) {
		
		numbers.stream().filter(number ->number%2==0).map(number ->number*number).forEach(System.out::println);
	}
	
	

}
