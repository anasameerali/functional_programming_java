package programming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FP05FunctionalFiles {

	public static void main(String[] args) throws IOException {
		String filePath = args[0];
		Files.lines(Paths.get(filePath))
		.map(line ->line.split(" "))
		.flatMap(Arrays::stream)
		.forEach(System.out::println);
		
		// to list the the directories in root path
		Files.list(Paths.get(".")).filter(Files::isDirectory).forEach(System.out::println);

	}

}
