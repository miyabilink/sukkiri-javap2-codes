public class Main {
    public static void main(String[] args) {
        Pocket p = new Pocket();
        p.put("1192");                  /* 文字列を格納 */
        String s = (String) p.get();    /* 取り出すときにキャストが必要 */
        System.out.println(s);
    }
}