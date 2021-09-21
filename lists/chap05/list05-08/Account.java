// 口座クラスです（朝香ver）
public class Account {
    private String accountNo;
    private int balance;
    private int accountType;            /* 口座種別を整数で受け取り格納 */
    public Account(String aNo, int aType) { /* … */ }
    /* : */
    public static final int FUTSU = 1;  /* 口座種別を表す定数宣言 */
    public static final int TOUZA = 2;
    public static final int TEIKI = 3;
}
// 【利用例】new Account("1732050", Account.FUTSU);