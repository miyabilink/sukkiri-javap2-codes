import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		/* Integer型でArrayListを宣言 */
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80); /* 自動的にIntegerに変換・格納される */
		points.add(75);
		for (int i : points) { /* enhanced-for文も利用可能 */
			System.out.println(i);
		}
	}
}