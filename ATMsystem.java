import java.util.*;
class bankaccount
{
    double balance;
    bankaccount(double balance)
    {
        this.balance=balance;
    }
    double initialbalance()
    {
        return balance;
    }
    void withdrawal(double amount)
    {
        if(amount<=balance)
        {
            balance=balance-amount;
            System.out.println("Withdrawal successful!\n");
        }
        else
        {
            System.out.println("Invalid input! Please try again.\n");
        }
    }
     void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Amount deposited successfully!\n");
        }
        else{
            System.out.println("Invalid input! Please try again.\n");
        }
    }
    double checkbalance()
    {
        return balance;
    }
}
class atm{
    Scanner sc=new Scanner(System.in);
    double balance=sc.nextDouble();
    bankaccount obj=new bankaccount(balance);
    void start()
    {
        while(true)
        {
            System.out.println("WELCOME TO THE ATM MACHINE");
            System.out.println("1. Initial Balance");
            System.out.println("2. Withdrawal");
            System.out.println("3. Deposit");
            System.out.println("4. Check balance");
            System.out.print("Enter your choice: ");
            int n=sc.nextInt();
            switch(n)
            {
                case 1: 
                    System.out.println("Your initial balance is: "+obj.initialbalance());
                    System.out.println();
                    break;
                case 2: 
                    System.out.print("Enter the amount you want to withdraw: ");
                    double withdraw=sc.nextDouble();
                    obj.withdrawal(withdraw);
                    break;
                case 3:
                    System.out.print("Enter the amount you want to deposit: ");
                    double amount=sc.nextDouble();
                    obj.deposit(amount);
                    break;
                case 4:
                    System.out.println("Your balance now is: "+obj.checkbalance());
                    System.out.println("THANK YOU FOR USING THE ATM!\n");
                    return;
                default: System.out.println("Invalid Choice! Please enter again\n");
            }
        }
    }
}
class ATMsystem
{
    public static void main(String args[])
    {
        atm x=new atm();
        x.start();
    }
}
    


