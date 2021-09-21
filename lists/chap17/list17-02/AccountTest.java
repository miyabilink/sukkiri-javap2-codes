import org.junit.Test;
public class AccountTest {
    @Test(expected=IllegalArgumentException.class)  /* 例外が発生することを確認する */
    public void testDeniesNegativeBalanceSet() {    /* テストケースの手法 */
        Account a = new Account();
        a.setBalance(-100);
    }
}