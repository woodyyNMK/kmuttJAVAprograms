package LabWeek5;
public class BankAccountTest {
    public static void main(String args[]){

        System.out.println(BankAccount.getCounter());

        BankAccount b1 = new BankAccount();
        System.out.println(BankAccount.getCounter());

        BankAccount b2 = new BankAccount();
        System.out.println(BankAccount.getCounter());
        
        b1.setBalance(500);
        b2.setBalance(1000);

        // System.out.println(b1.getBalance());
        // System.out.println(b2.getBalance());

        System.out.println(b1.toString());
        System.out.println(b1);
    }
}
