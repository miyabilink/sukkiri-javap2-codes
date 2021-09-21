public class Main {

    /* リスト1-5 ここから */
    boolean isValidPlayerName(String name) {
        if(name.length() != 8) {                /* 文字数が8文字であること */
            return false;
        }
        char first = name.charAt(0);
        if(!(first >= 'A' && first <= 'Z')) {   /* 最初の1文字はA～Z */
            return false;
        }
        for(int i = 1; i < 8; i++) {
            char c = name.charAt(i);
            if(!((c >= 'A' && c <= 'Z') || (c >= '0' && first <= '9'))) {
                return false;                   /* 以降の文字はA～Zか0～9 */
            }
        }
        return true;
    }
    /* リスト1-5 ここまで */

}