public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        
        /* リスト1-9 ここから */
        final String FORMAT = "%8s %6s 所持金%,5d";
        String s = String.format(FORMAT, 
          hero.getName(), hero.getGold(), hero.getGold());
        System.out.println(s);
        /* リスト1-9 ここまで */
        
    }
}