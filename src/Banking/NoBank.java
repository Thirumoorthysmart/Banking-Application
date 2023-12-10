package Banking;

public class NoBank implements BankingSystem{


    public int accountNo;

    public String accountName;

    private String secretCode;

    private double balance;
    public double minBalance;

    public static final double rateOfInterest=8;

    public NoBank( String accountName, String secretCode, double balance) {

        this.accountName = accountName;
        this.secretCode = secretCode;
        this.balance = balance;
        minBalance=5000;
    }

    public String addMoney(int money) {

        balance=balance+money;
        return "the"+money+"has been added.Then total balance is:"+balance;
    }

    public String checkBalance(String password) {
        if(password.equals(this.secretCode)){
            return "Available balnce is:"+balance;
        }else
            return "the entered secretCode is wrong";
    }

    public String withDrawMoney(String password, int money) {
        if(password.equals(secretCode)){
            if(balance>=(money+minBalance)){
                balance=balance-money;
                return "The withdraw is successfully.Final available balance is "+balance;
            }else {
                return "account balance is insufficient";
            }
        }else
            return "you entered wrong password";
    }

    public Double rateOfInterest(int year) {
        double rateofinterest=(balance*NoBank.rateOfInterest*year)/100;
        return rateofinterest;
    }
}
