package stage1a_oop;
class BankAccount{
    String name;
    int balance;
    BankAccount(String name, int balance){
        this.name = name;
        this.balance = balance;
    }

    void deposit(int money){
        balance = balance + money;
    }

    void withdraw(int money){
        if(money > balance){
            System.out.println("You don't have enough balance so can't withdraw");
        }else {
            balance = balance - money;
        }
    }
    String getSummary(){
        return name + " " + balance;
    }

    void printBalance(){
        System.out.println(name + " " + balance);
    }


    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Rahul", 7000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.printBalance();
        BankAccount acc2 = new BankAccount("Ash", 600);
        acc2.printBalance();
        String summary = acc.getSummary();
        System.out.println(summary);
    }
}