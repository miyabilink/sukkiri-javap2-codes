import java.sql.*;      /* java.sqlをインポートしておく */
public class Main {
    public static void main(String[] args) {

        // ********** リスト12-6ここから（import文は上記） **********
        // STEP 0: 事前準備（JAR配置を含む）
        try {
            Class.forName("org.h2.Driver");
        } catch(ClassNotFoundException e) {
            e.printStackTrace();                        /* ドライバが見つからない場合の処理（＊）*/
        }
        /* : */
        Connection con = null;
        try {
            // STEP 1: データベースの接続
            con = DriverManager.getConnection
                  ("jdbc:j2:~/rpgdb");     /* JDBC URLを指定 */
            con.setAutoCommit(false);                   /* 手動コミットモードに切替 */
            // STEP 2: SQL送信処理
            /* ***** メインのDB処理（SQL送信）***** */
            con.commit();                               /* コミット */
        } catch(SQLException e) {
            try {
                con.rollback();                         /* ロールバック */
            } catch (SQLException e2) {
                e2.printStackTrace();                   /* 接続やSQL処理の失敗時の処理（＊）*/
            }
        } finally {
            // STEP 3: データベース接続の切断
            if(con != null) {
                try {
                    con.close();
                } catch(SQLException e3) {
                    e3.printStackTrace();   /* 切断失敗時の処理（＊）*/
                }
            }
        }   /* ＊の箇所は必要に応じて適切なエラー処理を記述します */
        // ********** リスト12-6ここまで **********
    }
}
