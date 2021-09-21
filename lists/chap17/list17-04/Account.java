public class Account {
    private int balance;
    public void setBalance(int balance) {
        if(balance < 0) {
            throw new IllegalArgumentException(
              "負の残高が設定されそうになりました");
        }
        this.balance = balance;
    }
}