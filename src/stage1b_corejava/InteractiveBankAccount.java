package stage1b_corejava;
import java.util.Scanner;
class InteractiveBankAccount{
    String name;
    int balance;
    InteractiveBankAccount(String name, int balance){
        this.name = name;
        this. balance = balance;
    }
    void deposit(int money){
        balance = money + balance;
    }

    void withdraw(int money){
        if(balance < money){
            System.out.println("Cannot withdraw");
        }else {
            balance = balance - money;
        }
    }

    void summary(){
        System.out.println(name + " " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.println("Enter initial balance: ");
        int balance = sc.nextInt();
        sc.nextLine();

        InteractiveBankAccount bankAccount = new InteractiveBankAccount(name, balance);

        System.out.println("Enter amount to deposit");
        int money = sc.nextInt();
        sc.nextLine();

        bankAccount.deposit(money);

        System.out.println("Enter amount to withdraw");
        int withdraw_money = sc.nextInt();
        sc.nextLine();

        bankAccount.withdraw(withdraw_money);

        bankAccount.summary();
    }
}