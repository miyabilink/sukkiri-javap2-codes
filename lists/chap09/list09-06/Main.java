import java.io.*;                           
public class Main {                         
	// throwsで例外処理を省略しています
	// 実際の開発では正しく例外処理を行ってください
	public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(65); 
        baos.write(66);
        byte[] data = baos.toByteArray();
        // dataは「65」「66」が入った要素数2のbyte型配列
        /* : */
    }   /* 参考：バイト配列から１バイトずつ読み込む */
}       /* ByteArrayInputStreamもある */