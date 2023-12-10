package Banking;

public interface BankingSystem {
    public String addMoney(int money);

    public String checkBalance(String password);

    public String withDrawMoney(String password,int money);

    public Double rateOfInterest(int year);


}
