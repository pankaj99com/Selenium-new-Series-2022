package javaConcepts;

import java.util.stream.IntStream;

public class Operators {

	public static void main(String[] args) {

		int i = 45;
		int result = i / 10 + i % 10;

		System.out.println(result);

		int j = 55;
		j += 5;
		// j=j+5;
		j /= 5;
		// j=j/5;
		System.out.println(j);
		int b = 60 / 5 - 34 * 2;
		// 12-68
		System.out.println(b);

		int a = 6 * 5 - 34 / 2;
		System.out.println(a);

		int z = 5;

		if (z <= 5) {
			System.out.println("Divisible by 5");

		} else {

			System.out.println("Not divisible by 5");
		}
//ternerary operator
		System.out.println((z <= 5) ? "Divisble by 5" : "Not divisble by 5" + "test passesd");
	}

}
