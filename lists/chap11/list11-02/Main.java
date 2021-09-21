import java.net.*; 
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Socket sock = new Socket("dokojava.jp", 80);            /* (1) */
        InputStream is = sock.getInputStream();                 /* (2) */
        OutputStream os = sock.getOutputStream();
        os.write("GET /index.html HTTP/1.0\r\n".getBytes());    /* (3)HTTP要求を送信 */
        os.write("\r\n".getBytes()); os.flush();
        InputStreamReader isr = new InputStreamReader(is);
        int i = isr.read();                                     /* (3)応答を受信 */
        while(i != -1) {
            System.out.print((char) i);
            i = isr.read();
        }
        sock.close();                                           /* (4) */
    }
}       /* カッコ数字の行はp.319の手順(1)～(4)に相当するもの */