package github.codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleUnaryOperator;

public class ApproxInter {
	public static List<Double> interp(DoubleUnaryOperator f, double l, double u, int n) {
	    List<Double> list = new ArrayList<>();
	    
	    for (int i = 0; i < n; i++) {
	      
	      list.add(Math.floor(f.applyAsDouble(l + i*(u-l)/n)*100.0)/100.0);
	    }
	  return list;
	    }
	}

