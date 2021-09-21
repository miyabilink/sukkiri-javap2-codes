import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Hero hero1 = new Hero("ミナト", 75, 18);
        // (1)インスタンスの直列化と保存
        FileOutputStream fos =
            new FileOutputStream("c:\\rpgsave.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(hero1);                 /* インスタンス→バイト列 */
        oos.flush(); 
        oos.close();
        // (2)ファイルからインスタンスを復元
        FileInputStream fis =
            new FileInputStream("c:\\rpgsave.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Hero hero2 = (Hero) ois.readObject();   /* バイト列→インスタンス */
        ois.close();
    }
}