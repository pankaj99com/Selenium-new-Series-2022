package CollectionConcepts;

import java.util.List;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		
		List<String> s=new Stack<String>();//dynamic
		Stack<String> s1=new Stack<String>();//static
		
		s.add("pankaj");
		s1.push("Sandy");//1
		s1.push("Vishwa");//2
		s1.push("Pran");//3
		s1.pop();
		System.out.println(s1.peek());//vishwa
		System.out.println(s1.empty());
		System.out.println(s);
		System.err.println(s1);
	}

}
