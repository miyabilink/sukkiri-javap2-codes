public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 10000; i++) {
            sb.append("Java");      /* (1)バッファにJavaを追加 */
        }
        String s = sb.toString();   /* (2)完成した連結済み文字列を取り出す */
    }
}