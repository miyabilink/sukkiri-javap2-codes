class Outer {
	int outerField; static int outerStaticField;
	static class Inner {
		void innerMethod() {
			outerStaticField = 10;	/* staticな外部クラスメンバのみ利用可 */
		}
	}
	void outerMethod() {
		Inner ic = new Inner();		/* 外部クラスからはInnerで利用可 */
	}	
}

class Main {
	public static void main(String[] args) {
		Outer.Inner ic = new Outer.Inner(); 
				/* 無関係なクラスからはOuter.Innerで利用 */
	}
}