package JavaNotesByChandan.oopsinjava.encapuslution;
/*Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance.
Provide public getter and setter methods to access and modify these variables.

 */
 class Bankaccount {

    private long  accountNumber;
    private float balance;
    /*
         Encapsulating the accountNumber  and  balance
         only approachable and used using
         methods defined
        */



    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;

    }

    public void setBalance(float balance) {
        this.balance = balance;
    }


}


public class Demo {
    public static void main(String[] args) {

        Bankaccount Demobankaccount = new Bankaccount();
            Demobankaccount.setAccountNumber(329484392L);
    Demobankaccount.setBalance(768.7f);
            System.out.println( "AccountNumber :" + Demobankaccount.getAccountNumber());
         System.out.println( " Balance : " + Demobankaccount.getBalance());

    }
}


