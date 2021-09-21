import java.io.*; 
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Writer fw = new FileWriter("c:\\rpgsave.properties");
        Properties p = new Properties();
        p.setProperty("heroName", "アサカ");        /* データのセット */
        p.setProperty("heroHp", "62");
        p.setProperty("heroMp", "45");
        p.store(fw, "勇者の情報");                  /* ファイルへ書き出す */
        fw.close();                             /* ファイルの先頭にコメントとして出力される */
    }
}