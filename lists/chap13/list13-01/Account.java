package jp.miyabilink.atm;
/* クラス宣言の直前に書いたjavadocコメントは、そのクラスの解説文になる */
/**
 * 口座クラス。
 * このクラスは、１つの銀行口座を表します。
 */
public class Account {
    /* フィールドの直前に書いたjavadocコメントは、そのフィールドの解説文になる */
    /** 残高 */
    private int balance;
    /** 口座名義人 */
    private String owner;
    /* メソッド宣言の直前に書いたjavadocコメントは、そのメソッドの解説文になる */
    /* HTMLのタグも利用可能 */
    /**
     * 送金を行うメソッド。
     * このメソッドを呼び出すと、<b>他の</b>口座に送金します。
     */
    public void trandfer(Account dest, int amount) {
        /* : */
    /* ***** リスト13-1ここまで ***** */
    }
}