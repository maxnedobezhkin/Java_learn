package packageforstream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> collection = Arrays.asList("f5", "b6", "z7", "f1");
		Stream<String> collectionS = collection.stream();
		List<String> sorted = collection.stream()
				.filter(collectionElement -> collectionElement.contains("f"))
				.sorted()
				.collect(Collectors.toList());
		sorted.forEach(System.out::println);
	}
	

}
