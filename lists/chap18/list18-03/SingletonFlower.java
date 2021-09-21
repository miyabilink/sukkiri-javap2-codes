public final class SingletonFlower {
    private static SingletonFlower theInstance;     /* 唯一のインスタンス保存用 */
    private SingletonFlower() {}                    /* privateなコンストラクタ */
    public static SingletonFlower getInstance() {   /* インスタンス取得用 */
        if(theInstance == null) {
            theInstance = new SingletonFlower();
        }
        return theInstance;
    }
}