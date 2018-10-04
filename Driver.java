//This driver is not up-to-date with what we did in class; doesn't test the transferTo method or authenticate

public class Driver {
  public static void main(String[] args) {
    BankAccount a = new BankAccount(0.00, 123, "abc");
    //constructor for new BankAccount
    System.out.println(a.getBalance() + " : This is your current balance");
    // should print "0.00 : This is your current balance"
    System.out.println(a.getAccountID() + " : This is your accountID");
    // should print "123 : This is your accountID")
    //we will set pw even though there is no getPassword:
    //a.setPassword("abc");
    System.out.println(a);
    //this should print 123 0.00;
    if (a.deposit(124.98)) {
        System.out.println("Deposited 124.98 -- Deposit success!");
      }
    else {
        System.out.println("Could not deposit 124.98 -- Deposit failed!");
    }
    System.out.println(a.getBalance() + " : This is your new balance");
    if (a.withdraw(130)) {
      System.out.println("Withdrew 130 -- Withdrawal success!");
    }
    else {
      System.out.println("Could not withdraw 130 -- Withdrawal failure!");
    }
    System.out.println(a.getBalance() + ": This is your new balance!");
    if (a.withdraw(20)) {
      System.out.println("Withdrew 20 -- Withdrawal success!");
    }
    else {
      System.out.println("Could not withdraw 20 -- withdrawal failure!");
    }
    System.out.println(a.getBalance() + ": This is your new balance!");
    System.out.println("Thank you for using Alma's banking service!");
  }
}
