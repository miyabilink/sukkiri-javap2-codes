import java.lang.reflect.*;

public class Main {
	public static void main(String[] args) {
		// Stringに関する情報を取得して表示する
		Class<?> info1 = String.class;
		System.out.println(info1.getSimpleName()); // ⇒ String
		System.out.println(info1.getName()); // ⇒ java.lang.String
		System.out.println(info1.getPackage().getName()); // ⇒ java.lang
		System.out.println(info1.isArray()); // ⇒ false
		// Stringの親クラスの情報を取得する
		Class<?> info2 = info1.getSuperclass();
		System.out.println(info2.getName()); // ⇒ java.lang.Object
		// なおargsは、きちんと文字列配列として判定される
		Class<?> info3 = args.getClass();
		System.out.println(info3.isArray()); // ⇒ true
	}
}
