import java.net.*; 

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("起動完了。");
        ServerSocket svSock = new ServerSocket(39648);      /* 待ち受けポート */
        Socket sock = svSock.accept();                      /* 呼び出すと誰かから接続されるまで待ち続ける */
        System.out.println(sock.getInetAddress() + "から接続");
        sock.getOutputStream().write("WELCOME".getBytes());
        sock.getOutputStream().flush(); sock.close();       /* データを送信してすぐに切断 */
}  }
/* ＊複数の相手から同時に接続を受け付けるサーバプログラムは、 */
/* 19章で学ぶスレッドなどを駆使して実装する必要があります    */