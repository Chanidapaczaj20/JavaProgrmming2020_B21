package day35_customClass;

import java.time.LocalDate;

public class BankAccount {

    public String accountName;
    public String accountNumber;
    public double availableBalance = 0;

    public void setInfo(String acctName, String acctNumber ){
        accountName = acctName;
        accountNumber = acctNumber;
    }

    public void getInfo(){
        System.out.println("============================================");
        System.out.println("Account Name: "+accountName);
        System.out.println("Account number: "+accountNumber);
        System.out.println("Available Balance: $"+availableBalance);
        System.out.println("============================================");
    }


    public void deposit(double amount){
        availableBalance += amount;
    }

    public void withdraw(double amount){
        availableBalance -= amount;
    }

    public void showBalance(){
        System.out.println("As of "+ LocalDate.now() + ", "+accountName+ "' available balance is: $"+ availableBalance);
    }

}
