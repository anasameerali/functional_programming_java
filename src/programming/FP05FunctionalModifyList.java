package programming;

import java.util.ArrayList;
import java.util.List;

public class FP05FunctionalModifyList {

	public static void main(String[] args) {
		
		List<String> skills =List.of("java","scala","spark","jsp","javascrpt");
		List<String> modifyableskills =new ArrayList<String>(skills);
		 modifyableskills.replaceAll(str ->str.toUpperCase());
	    System.out.println(modifyableskills);	
	}

}
