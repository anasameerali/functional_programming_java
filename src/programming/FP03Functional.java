package programming;

import java.util.Comparator;
import java.util.List;

public class FP03Functional {
	public static void main(String[] args) {
		List<String> skills =List.of("spark","java","scala","python","jenkins","openshift");
		printListInAscendingOrder(skills);
		printListInDescendingOrder(skills);
		printListBasedOnLength(skills);
	}

	private static void printListBasedOnLength(List<String> skills) {
		System.out.println("Based oN length order");
		skills.stream().sorted(Comparator.comparing(str -> str.toString().length())).forEach(System.out::println);
		
	}

	private static void printListInAscendingOrder(List<String> skills) {
		System.out.println("In Ascendng order");
		skills.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
	}
	private static void printListInDescendingOrder(List<String> skills) {
		System.out.println("In Descending order");
		skills.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}

}
