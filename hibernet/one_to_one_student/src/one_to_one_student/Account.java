package one_to_one_student;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int acno;
	
	private String name;
	private String addr;
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy="account")
	private AccountPlus acplus;

	public int getAcno() {
		return acno;
	}

	public void setAcno(int acno) {
		this.acno = acno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public AccountPlus getAcplus() {
		return acplus;
	}

	public void setAcplus(AccountPlus acplus) {
		this.acplus = acplus;
	}
	
	
	
	
	
	

}
