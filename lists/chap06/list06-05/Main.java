import java.util.function.*;
public class Main {
    public static void main(String[] args) {
    	/* ここからリスト6-5 */
    	double b = 1.41;
    	IntToDoubleOperator func = (x) -> {
    		return x * x * b;
    	}
    	/* ここまでリスト6-5 */
    }
}