// 口座クラスです（列挙型活用ver）
public class Account {
    private String accountNo;
    private int balance;
    private AccountType accountType;    /* 口座種別を列挙型で受け取り格納 */
    public Account(String aNo, AccountType aType) { /* … */ }
    /* : */
}
// 【利用例】new Account("1732050", AccountType.FUTSU);