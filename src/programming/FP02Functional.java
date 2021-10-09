package programming;

import java.util.List;
public class FP02Functional {

	public static void main(String[] args) {
     List <Integer> numbers = List.of(1,2,3,4,5);
     int sum = sumOfAllnumbersinList(numbers);
     System.out.println("sum ="+sum);
	}

	private static int sumOfAllnumbersinList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream().reduce(0, (a,b) ->a+b);
	}

}
