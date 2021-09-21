public class Account {
    String accountNo;                   // 口座番号（先頭に空白が入ることもある）
    /* : */
    public boolean equals(Object o) {   /* 引数はObject型にすること */
        if(o == this) return true;                                  /* (1) */
        if(o == null) return false;                                 /* (2) */
        if(!(o instanceof Account)) return false;                   /* (3) */
        Account r = (Account) o;
        /* 先頭と末尾の空白を取り除いた口座番号が等しければ、等価とみなす */
        if(!this.accountNo.trim().equals(r.accountNo.trim()))       /* (4) */
           {  return false;
        }
        return true;
    }
}