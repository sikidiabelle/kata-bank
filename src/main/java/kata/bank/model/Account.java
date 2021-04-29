package kata.bank.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int idAccount;
	
	public double balance;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "account", fetch=FetchType.LAZY)
	public List<Transaction> listTransactions;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUser")
	@JsonBackReference
	public User user;

	public int getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<Transaction> getListTransactions() {
		return listTransactions;
	}

	public void setListOperations(List<Transaction> listTransactions) {
		this.listTransactions = listTransactions;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	

}
