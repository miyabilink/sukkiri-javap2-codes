import java.io.*;     

public class Main {                 
	// throwsで例外処理を省略しています
	// 実際の開発では正しく例外処理を行ってください
	public static void main(String[] args) throws IOException {
        String msg = "第1土曜";
        Reader sr = new StringReader(msg);
        char c1 = (char) sr.read(); /* c1には「第」が入る */
        char c2 = (char) sr.read(); /* c2には「１」が入る */
        /* : */
    }
}       /* 参考：文字列に１文字ずつ書き込むStringWriterもある */