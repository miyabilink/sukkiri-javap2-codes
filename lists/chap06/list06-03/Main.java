public class Main {
    public static int sub(int a, int b) {
    	return a - b; 
    }
    public static void main(String[] args) {
    	MyFunction func = Main::sub; /* 宣言したインタフェース型に代入 */
    	int a = func.call(5, 3);	/* インタフェースのメソッドで呼び出し */
    	System.out.println("5-3は" + a);
    }
}