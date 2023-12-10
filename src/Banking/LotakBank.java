package Banking;

public class LotakBank implements BankingSystem{

    private String accountNo;

    private String password;

    private Double balance;

    public static final  Double rateOfInterest=6.5;

    public LotakBank( String password, Double balance) {
        //this.accountNo = accountNo;
        this.password = password;
        this.balance = balance;
    }

    public String addMoney(int money) {
        balance=balance+money;
        return  "The"+money+"was added.And balance is"+balance;
    }

    public String checkBalance(String password) {
        if(password.equals(this.password)){
            return "Available balance is"+balance;
        }else
            return "Password worng Enter correct Password";
    }

    public String withDrawMoney(String password, int money) {
        if (password.equals(this.password)) {
            if (balance >= money) {
                balance = balance - money;
                return "The" + money + "has been debited";
            } else
                return "Insufficient balance";
        }else{
            return "The entered password is wrong !!";
        }
    }

    public Double rateOfInterest(int year) {
        double rateofinterest=(balance*LotakBank.rateOfInterest*year);
        return rateofinterest;
    }
}
