import java.sql.*;      /* java.sqlをインポートしておく */
public class Main {
    public static void main(String[] args) {
        // STEP 0: 事前準備（JAR配置を含む）
        try {
            Class.forName("org.h2.Driver");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();            /* ドライバが見つからない場合の処理（＊）*/
        }
        /* : */
        Connection con = null;
        try {
            // STEP 1 データベースの接続
            con = DriverManager.getConnection("jdbc:h2:~/rpgdb");  /* JDBC URLを指定 */
            
            // STEP 2-(2)-1 送信すべきSQLの雛形を準備
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM MONSTERS WHERE HP >= ?");
            
            // STEP 2-(2)-2 ひな形に値を流し込みSQLを組み立て送信する
            pstmt.setInt(1, 10);            // １番目の？に10を流し込み
            ResultSet rs = pstmt.executeQuery();
            
            // STEP 2-(2)-3 結果表を処理する
            // ********** リスト12-4 ここから **********
            while(rs.next()) {                              /* 結果行の最後まで繰り返す */
                System.out.println(rs.getString("NAME"));   // 注目行について処理
            }
            // ********** リスト12-4 ここまで **********
            
            rs.close();
            pstmt.close();                  // 後片付け
            
        } catch(SQLException e) {
            e.printStackTrace();            /* 接続やSQL処理の失敗時の処理（＊）*/
        } finally {
            // STEP 3 データベース接続の切断
            if(con != null) {
                try {
                    con.close();
                } catch(SQLException e) {
                    e.printStackTrace();    /* 切断失敗時の処理（＊）*/
                }
            }   /* ＊の箇所は必要に応じて適切なエラー処理を記述します */
        }
    }
}