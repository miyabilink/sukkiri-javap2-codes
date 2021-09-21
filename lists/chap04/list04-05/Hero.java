class Hero {
    String name;   int hp;
    public int hashCode() {
        int result = 37;                            /* (1) 適当な初期値を決める */
        result = result * 31 + name.hashCode();     /* (2) 各フィールドの影響を加える */
        result = result * 31 + hp;
        return result;                              /* (3) 結果を返す */
    }
}