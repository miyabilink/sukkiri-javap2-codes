import java.util.*;
import java.io.*;
import java.sql.*;

public class ItemDAO {
    public static ArrayList<Item> findByMinimumPrice(int i) {
        try {
            Class.forName("org.h2.Driver");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:h2:~/rpgdb");
            PreparedStatement pstmt = con.prepareStatement
            		("SELECT * FROM ITEMS WHERE PRICE > ?");
            pstmt.setInt(1, i);
            ResultSet rs = pstmt.executeQuery();
            // ここでItemを入れていくArrayListを準備
            ArrayList<Item> items = new ArrayList<Item>();
            while(rs.next()) {      // 結果表の全行を１つずつ処理
                Item item = new Item();
                item.setName(rs.getString("ANME"));     /* 1行分の情報を */
                item.setPrice(rs.getInt("PRICE"));      /* インスタンスに変換 */
                item.setWeight(rs.getInt("WEGIHT"));
                items.add(item);                        /* インスタンスをArrayListに追加 */
            }
            rs.close();
            pstmt.close();
            return items;                               /* 最後にArrayListを返す */
        } catch(SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            if(con != null) {
                try {
                    con.close();
                } catch(SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
