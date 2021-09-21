import java.util.function.*;
public class Main {
    public static int sub(int a, int b) {
    	return a - b; 	/* 2つのint値を受け取り、その差を求め、結果を返す関数 */
    }
    public static void main(String[] args) {
    	// subメソッドの処理ロジックを、変数funcに代入する
    	IntBinaryOperator func = Main::sub;
    	// 変数funcに格納されている処理ロジックを、引数5と3で実行する
    	int a = func.applyAsInt(5,  3);
    	System.out.println("5-3は" + a);
    }

}