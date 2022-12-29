package LabWeek5;
public class BankAccount {
    private int accId;
    private double balance;
    private final int MAX_BALANCE = 1000000;
    private static int count;

    public static int getCounter(){
        return count;
    }
    public BankAccount(){
        count++;
    }

    public int getId(){
        return accId;
    }
    public double getBalance(){
        return balance;
    }

    public void setAccId(int accId){
        this.accId = accId;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        balance = balance +amount;
    }
    public void withdraw(double amount){
        if(balance>=amount){
            //enough money
            balance = balance - amount;
        }else{
            System.out.println("Not Enough");
        }
    }
    public String toString(){
        return "Account id = "+ accId +"\nBalance = " +balance;
    }

}
