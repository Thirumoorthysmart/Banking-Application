import Banking.BankingSystem;
import Banking.NoBank;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your account name");
        String name=sc.next();
        System.out.println("Enter your secret code");
        String secretCode=sc.next();
        System.out.println("Enter initial amount");
        int initialBalance=sc.nextInt();

        BankingSystem bankAc=new NoBank(name,secretCode,initialBalance);
        System.out.println("Enter money into you want add");
        int money=sc.nextInt();
        String result= bankAc.addMoney(money);
        System.out.println(result);

        System.out.println("Enter secretCode");
        String secCode=sc.next();
        System.out.println("Enter withdraw amount");
        int withDrawAmount=sc.nextInt();
        result=bankAc.withDrawMoney(secCode,withDrawAmount);
        System.out.println(result);


        System.out.println("Enter the how many years deposit");
        int depositYear=sc.nextInt();
        double out=bankAc.rateOfInterest(depositYear);
        System.out.println(out);

    }
}