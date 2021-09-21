import java.util.function.*;
public class Main {
    public static void main(String[] args) {
    	// 「2つの引数の差を求める処理」の実体を生み出し、代入する
    	IntBinaryOperator func = (int a, int b) -> {return a - b; }
    	MyFunction func = Main::sub; /* 宣言したインタフェース型に代入 */
    	int a = func.call(5, 3);	/* インタフェースのメソッドで呼び出し */
    	System.out.println("5-3は" + a);
    }
}