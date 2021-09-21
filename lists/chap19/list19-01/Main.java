import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("なにか入力してください");
        new Scanner(System.in).nextLine();      /* 入力処理 */
        for(int i = 0; i < 10; i++) {           /* 表示処理 */
            System.out.println(i);
        }
    }
}