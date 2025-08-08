class CurrentAccount2 extends Account2 { 
    private double overdraft_limit;
    public CurrentAccount2(String account_no, double account_balance, double overdraft_limit) {
        super(account_no, account_balance);
        this.overdraft_limit = overdraft_limit;
    }
    public double getOverdraftLimit() {
        return overdraft_limit;
    }
    double getOverDrawnAmmount(){
        return Math.max(0,overdraft_limit-account_balance);
    }
}

