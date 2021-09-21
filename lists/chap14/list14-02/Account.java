public class Account {
    String owner;   // 口座名義人
    int balance;    // 口座残高
    // 引数を2つ持つコンストラクタ
    public Account(String owner, int balance) {
        owner = owner;  balance = balance;
    }
    // 送金を行うメソッド
    public void transfer(Account dest, int amount) {
        dest.balance += amount;  balance -= amount;
    }
}