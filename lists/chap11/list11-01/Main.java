import java.io.*;       
import java.net.*;      

public class Main {
	// 解説のために例外処理を省略しています
	// 実際に利用する際は正しくtry-catchしてください
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://dokojava.jp");
        InputStream is = url.openStream();
        InputStreamReader isr = new InputStreamReader(is);
        int i = isr.read();
        while(i != -1) {
            System.out.print((char) i);
            i = isr.read();
        }
        isr.close();
    }
}