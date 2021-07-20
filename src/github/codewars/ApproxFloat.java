package github.codewars;
import java.math.BigDecimal;
import java.math.*;

public class ApproxFloat {
	 public static double f(double x) {
		    MathContext mc = new MathContext(100);
		    BigDecimal bg = BigDecimal.valueOf(1+x);
		    BigDecimal result =  bg.sqrt(mc);
		    result = result.subtract(BigDecimal.ONE);
		    
		    return result.doubleValue();
		    }
}
