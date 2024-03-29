package entitites;

public class BusinessAccount extends Account {

	private Double loanLimite;

	public BusinessAccount() {
		super();
	}

	// Com o super eu herdo os argumentos da classe Account
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimite) {
		super(number, holder, balance);
		this.loanLimite = loanLimite;
	}

	public Double getLoanLimite() {
		return loanLimite;
	}

	public void setLoanLimite(Double loanLimite) {
		this.loanLimite = loanLimite;
	}

	public void loan(double amount) {
		if (amount <= loanLimite) {
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
				
	}

}
