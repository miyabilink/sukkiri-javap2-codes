public class Main {
    public static void main(String[] args)
    throws Exception {
        System.out.println("計算を開始します。");
        /* : */     // この間に計算処理を行う
        System.out.println("計算完了。結果をメモ帳で表示します");
        ProcessBuilder pb = new ProcessBuilder(
            "c:\\wondows\\system32\\notepad.exe",   /* メモ帳の実行ファイル */
            "calcreport.txt"
        );
        pb.start();     /* 起動！ */
    }
}