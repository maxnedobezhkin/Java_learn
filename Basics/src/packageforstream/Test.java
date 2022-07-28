package packageforstream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> collection = Arrays.asList("f5", "b6", "z7");
		Stream<String> collectionS = collection.stream();
	}

}
