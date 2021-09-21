import java.io.*;
public class Main {

    /* リスト10-1　ここから */
    public void saveHeroToFile(Hero h) throws IOException {
        Writer w = new BufferedWriter(new FileWriter("rpgsave.dat"));
        w.write(h.name + "\n");     // 名前の末尾に改行をつけ保存
        w.write(h.hp + "\n");       // HPの末尾に改行をつけ保存
        w.write(h.mp + "\n");       // MPの末尾に改行をつけ保存
        w.flush(); 
        w.close();
    }
    /* リスト10-1　ここまで */

}