package github;

import java.util.ArrayList;
import java.util.List;

public class LambdaPractice1 {

	public static void main(String[] args) {
		
		//ILambdaPractice1 lambdaPractice1 = new ILambdaPractice1();
		//lambdaPractice1.print();
		
		ILambdaPractice1 LambdaPrintFunction = s -> System.out.println("the string is " + s);
		LambdaPrintFunction.print("'hello world!'");
		
		List<ListExample1> list = new ArrayList<ListExample1>();
		//.asList(
		ListExample1 eg1 = new ListExample1(1, "venky", 26);
		ListExample1 eg2 = new ListExample1(2, "kevin", 25);
		ListExample1 eg3 = new ListExample1(3, "ben", 24);
		
		list.add(eg1);
		list.add(eg2);
		list.add(eg3);
		
		for (ListExample1 l : list)
			System.out.println(l);
	}
}

@FunctionalInterface
interface ILambdaPractice1{
	void print(String s);
}