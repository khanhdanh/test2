public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
  public void checkBalance(){
    System.out.println("Hello!");
    System.out.println("Your balance is "+ balance);
  }
  public int deposit(int amountToDeposit , int amountToWithdraw ){
    balance = amountToDeposit + balance;
    System.out.println("You just deposited "+amountToDeposit);
    balance = balance - amountToWithdraw;
    System.out.println("You just withdrew "+amountToWithdraw);
    return amountToWithdraw;
  }
  // public int withdraw(int amountToWithdraw ){
  //   balance = balance - amountToWithdraw;
  //   System.out.println("You just withdrew "+amountToWithdraw);
  //   return amountToWithdraw;
  // }

  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);

    //Check balance:
    savings.checkBalance();
    
    //Withdrawing:
    // int afterWithdraw = savings.balance - 300;
    // savings.balance = afterWithdraw;
    // savings.withdraw(300);
    savings.deposit(600, 300);
    
    // Check balance:
    savings.checkBalance();
    
    //Deposit:
    // savings.withdraw(600);
    savings.deposit(600, 600);
    
    //Check balance:
    savings.checkBalance();
    
    //Deposit:
    // savings.withdraw(600);
    savings.deposit(600, 600);
    
    //Check balance:
    savings.checkBalance();
    
  }       
}


