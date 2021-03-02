package one_to_one_student;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AccountPlus 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int acpid;
	private int amt;
	private String actype;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Account account;

	public int getAcpid() {
		return acpid;
	}

	public void setAcpid(int acpid) {
		this.acpid = acpid;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	public String getActype() {
		return actype;
	}

	public void setActype(String actype) {
		this.actype = actype;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
	

}
