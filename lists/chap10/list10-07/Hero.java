import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Hero {
    String name;
    int hp;
    int mp;
    
    Hero(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    /* リスト10-7　ここから */
    public Hero loadHeroFromFile() throws IOException {
        BufferedReader br = 
        		new BufferedReader(new FileReader("c:\\rpgsave.dat"));
        String name = br.readLine();    // 改行まで名前として読む
        String hp = br.readLine();      // 改行までHPとして読む
        String mp = br.readLine();      // 改行までMPとして読む
        br.close();
        return new Hero
        		(name,Integer.parseInt(hp), Integer.parseInt(mp));
    }
    /* リスト10-7　ここまで */

}