public class Pocket<E> {                    /* 仮型引数を伴うクラス宣言 */
    private E data;                         /* 仮型引数Eを利用したメンバ宣言 */
    public void put(E d) { this.data = d; } 
    public E get() { return this.data; }
}