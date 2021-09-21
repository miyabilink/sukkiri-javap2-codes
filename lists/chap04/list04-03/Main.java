import java.util.*;
class Hero { public String name; }  /* equals()をオーバーライドしていない */
public class Main {
    public static void main(String[] args) {
        List<Hero> list = new ArrayList<Hero>();
        Hero h1 = new Hero(); h1.name = "ミナト";
        list.add(h1);               /* インスタンスを作って格納 */
        System.out.println("要素数=" + list.size());
        h1 = new Hero(); h1.name = "ミナト";
        list.remove(h1);            /* 名前が「ミナト」の勇者を削除 */
        System.out.println("要素数=" + list.size());
    }
}