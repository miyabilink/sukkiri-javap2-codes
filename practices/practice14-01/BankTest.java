import org.junit.Test;
import static org.junit.Assert.*;

public class BankTest {
    // (1)正常系：「ミヤビ」をセットできるか
    @Test public void setName() {
        Bank b = new Bank();
        b.setName("ミヤビ");
    }
    // (2)異常系：nullをセットしようとしたら例外が起きるべき
    @Test public void getNameWithNull() {
        try {
            Bank b = new Bank();
            b.setName(null);
        } catch(NullPointerException e) {
            return;
        }
        fail();
    }
    // (3)異常系：２文字をセットしようとしたら例外が起こるべき
    @Test(expected = IllegalArgumentException.class)
    public void throwsExceptionWithTwoName() {
        Bank b = new Bank();
        b.setName("ミヤ");
    }
}   /* 本文では割愛しましたが、このようにアノテーションの直後に */
    /* 例外を記述し、その中にテストしたいコードを記述することも */
    /* できます。もちろん(2)のように自分でtry-catchをしても */
    /* 構いません。 */
