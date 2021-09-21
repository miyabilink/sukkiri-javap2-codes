public class Account implements Comparable<Account> {
	int number;		// 口座番号
	/* : */
	public int compareTo(Account obj) {
		if(this.number < obj.number) {
			return -1;
		}
		if(this.number > obj.number) {
			return 1;
		}
		return 0;
	}
}
