public class Main {
    public static void main(String[] args) {
        Pocket<Object> pocket = new Pocket<Object>();
        System.out.println("使い捨てのインスタンスを作りPocketに入れます");
        pocket.put(new Object() {       /* メンバを２つもつ匿名クラスを */
         String innerField;             /* 宣言すると同時にインスタンス化 */
         void innerMethod() { /* … */ }
        } );
    }
}