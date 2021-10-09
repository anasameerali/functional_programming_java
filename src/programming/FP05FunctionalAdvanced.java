package programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FP05FunctionalAdvanced {

	public static void main(String[] args) {
		List<String> skills = List.of("spring","spark","hive","hbase","oracle","java");
	// t combine all elements of list by comma
		System.out.println(skills.stream().collect(Collectors.joining(",")));
	// split the the list of string to lis of char
	 
	  Stream<String>	strm =skills.stream().map(skill -> skill.split("")).flatMap(Arrays::stream);
		
	  System.out.println(strm.collect(Collectors.toList()));
	  
	  //to group the element with same length
	  List<String> skills2 = List.of("spring","spark","hive","hbase","oracle","java");
	  
	  System.out.println(skills.stream().map(skill1 ->skills2.stream().filter(skill2 -> skill2.length()==skill1.length()).sorted().collect(Collectors.toList())).distinct().collect(Collectors.toList()));
	}
}
