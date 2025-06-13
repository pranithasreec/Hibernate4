package hibernate.BankMap;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {

	    @Id
	    int accountId;
	    String type;
	    double balance;

	    public Account() {}

	    public Account(int accountId, String type, double balance) {
	        this.accountId = accountId;
	        this.type = type;
	        this.balance = balance;
	    }

		public int getAccountId() {
			return accountId;
		}

		public void setAccountId(int accountId) {
			this.accountId = accountId;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		@Override
		public String toString() {
			return "Account [accountId=" + accountId + ", type=" + type + ", balance=" + balance + "]";
		}
	    

}
