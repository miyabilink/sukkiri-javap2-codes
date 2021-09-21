public class Account {  private int balance;
    public void setBalance(int x) {
        if(x < 0) throw new IllegalArgumentException();
        balance = x;
    }
}