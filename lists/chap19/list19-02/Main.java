import java.util.*;

class PrintingThread extends Thread {   /* (1)表示を行う別スレッドを定義 */
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("なにか入力してください");
        Thread t = new PrintingThread();
        t.start();                          /* (2)別スレッドを開始 */
        new Scanner(System.in).nextLine();  /* 入力処理 */
    }
}