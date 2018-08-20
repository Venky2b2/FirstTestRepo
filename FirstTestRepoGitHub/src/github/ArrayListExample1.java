package github;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample1 {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>(Arrays.asList("venky", "kevin", "nivi"));
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(names);
		
		Collections.sort(names, Collections.reverseOrder());
		System.out.println(names);
		
		names.add("india");
		System.out.println(names);
	}

}
