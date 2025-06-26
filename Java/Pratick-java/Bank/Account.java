class Account{
    public String account_no;
    public double account_balance;

    Account(String no, double bal){
        account_no = no;
        account_balance = bal;
    }

    String getAccountNo(){
        return account_no;
    }

    double getAccountBal(){
        return account_balance;
    }
    public static void main(String[] args) {
        Account Aditaya = new Account("75478", 0.00);
    }
}