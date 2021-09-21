public class Main {
    public static void main(String[] args) {
        String s = "abc,def:ghi";
        String[] words = s.split("[,:]");   /* 正規表現パターン */
        for(String w : words) { System.out.println(w + "->"); }
    }
}