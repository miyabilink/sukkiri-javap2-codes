public class Main {
    public static void main(String[] args) {
        Pocket<String> p = new Pocket<String>();    /* Stringという実型引数を指定 */
        p.put("1192");
        String s = p.get();                         /* キャストは不要 */
        System.out.println(s);
    }
}