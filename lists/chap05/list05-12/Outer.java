public class Outer {
    int outerMember;                // 非finalメンバ
    void outerMethod() {
        int a = 10;                 // 非finalローカル変数
        class Inner {               /* ここでInnerを定義 */
            public void innerMethod() {
                System.out.println("innerMethodです");
                System.out.println(outerMember);
            }                       /* ローカルクラスの内部からouterMemberは利用できるが変数aは利用できない */
        }                           /* （Java8以降では変数aは暗黙的にfinalとして扱われるため利用可能） */
        Inner ic = new Inner();     /* 同じメソッド内ですぐに利用 */
        ic.innerMethod();
    }
}
