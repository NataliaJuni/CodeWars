package github.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CodeWars {

	public static void main(String[] args) {
		System.out.println(ApproxInter.interp(x -> x, 0.0, 0.9, 3));
		System.out.println(ApproxInter.interp(x -> x, 0.0, 0.9, 4));
		System.out.println(ApproxInter.interp(x -> x, 0.0, 1.0, 4));
		System.out.println(ApproxInter.interp(x -> Math.sin(x), 0.0, 0.9, 3));
		
		
	}
}
