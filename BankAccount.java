public class BankAccount {
  //fields
  private double balance;
  private int accountID;
  private String password;
  //constructors
  public BankAccount(double x, int y) {
    balance = x;
    accountID = y;
  }
  //public BankAccount(String z) {
  //  password = z;
  //}
  //accessor methods
  public double getBalance() {
      return balance;
  }
  public int getAccountID() {
    return accountID;
  }
  public void setPassword(String z) {
    password = z;
  }
  public String toString() {
    return accountID + "\t" + "" + balance;
  }
  public boolean deposit(double amount) {
    if (amount < 0) {
      return false;
    }
    else {
      balance+=amount;
      return true;
    }
  }
  public boolean withdraw(double amount) {
    if (amount < 0 || amount > balance) {
      return false;
    }
    else {
      balance-=amount;
      return true;
    }
  }
}
