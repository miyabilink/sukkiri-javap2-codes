public class Main {
    public void methodA() {
        synchronized(this) { /* … */ }     /* synchronizedブロックによる方法 */
    }
    public synchronized void methodB() {    /* synchronized修飾子による方法 */
        /* : */
    }
}