package hibernate.BankMap;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Customer {

    @Id
    int customerId;
    String name;

    @OneToMany(targetEntity = Account.class, cascade = CascadeType.ALL)
    List<Account> accounts;

    public Customer() {}

    public Customer(int customerId, String name, List<Account> accounts) {
        this.customerId = customerId;
        this.name = name;
        this.accounts = accounts;
    }

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", accounts=" + accounts + "]";
	}
    
}
