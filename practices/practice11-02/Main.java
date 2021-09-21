import java.io.*; 
import java.net.*;

public class Main {     
	// 実際には適切に例外処理を行ってください
    public static void main(String[] args) throws Exception {
        Socket sock = new Socket("smtp.example.com",60025);
        OutputStream os = sock.getOutputStream();
        os.write("HELO example.com\r\n".getBytes());
        // (上の行と同じ手順で、問題文の各行の内容をos.write()で書き込む)
        os.flush(); 
        sock.close();
    }
}