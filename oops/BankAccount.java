class BankAccount {
    double balance;
    void ViewBalance()
    {
 System.out.println("available balance is "+balance);
    }

    void Deposite(int n)
    {
        System.out.println("deposite amount is "+n);
        balance=balance+n;
        System.out.println("Total balance after deposited "+balance);
        
    }
    void WithDraw(int n){
        System.out.println("withdraw amount is "+n);
        balance=balance-n;
        System.out.println("total balance after withdrawed "+balance);
    }
}
class Mainclass{
    public static void main(String[] args) {
        System.out.println("main started");
        BankAccount ba1=new BankAccount();
        ba1.balance=10000;
        System.out.println("balance is "+ba1.balance);
        ba1.ViewBalance();
        ba1.Deposite(3000);
        ba1.WithDraw(2000);
        System.out.println("main ended");
        
    }
}
