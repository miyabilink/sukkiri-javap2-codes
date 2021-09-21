import java.io.*;
public class Main {
    public void saveHeroToFile(Hero h) throws IOException {
        Writer bw = new BufferedWriter(new FileWriter("rpgsave.dat"));

        /* リスト10-2　ここから */
        bw.write(h.name); 
        bw.write(",");    /* デリミタの出力 */
        bw.write(h.hp);   
        bw.write(",");
        bw.write(h.mp);
        /* リスト10-2　ここまで */

        bw.flush(); bw.close();
    }
}