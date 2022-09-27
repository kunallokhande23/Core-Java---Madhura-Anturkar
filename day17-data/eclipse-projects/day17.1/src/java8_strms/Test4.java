package java8_strms;

import java.util.stream.IntStream;

public class Test4 {

	public static void main(String[] args) {
		// Create range of numbers between 2 --50 n print even nos.
		//API : IntStream --range/rangeClose : src
		//intermediate filter op : API of java.util.stream.IntStream : i/f
		//public static IntStream filter(IntPrdicate filter)
		//java.util.function.IntPredicate : public boolean test(int i)
		System.out.println("Even nos in 2-50");
		IntStream.rangeClosed(2, 50) //src : IntStream 2---50
		.filter(i -> i % 2 == 0) //IntStream 2---50 : even elems --intermediate op
		.forEach(i -> System.out.println(i)); //terminal op.

	}

}
