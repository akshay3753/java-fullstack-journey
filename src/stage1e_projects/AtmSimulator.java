package stage1e_projects;

import java.util.Scanner;

public class AtmSimulator {
    int pin;
    int balance;
    AtmSimulator(int pin, int balance) {
        this.pin = pin;
        this.balance = balance;
    }


    public static void main(String[] args) {
        AtmSimulator atm = new AtmSimulator(4567, 2000);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Pin : ");
        int enteredPin = sc.nextInt();
        if(enteredPin == atm.pin){
            System.out.println("Menu: ");
        }else {
            System.out.println("Wrong Pin");
        }
        while(true){
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            if(choice == 1){
                System.out.println(atm.balance);
            } else if(choice == 2){
                System.out.print("Enter the amount to deposit: ");
                int amount = sc.nextInt();
                atm.balance = amount + atm.balance;
            } else if(choice == 3){
                // ask amount, check if sufficient, deduct
                System.out.print("Enter the amount to withdraw: ");
                int withdraw_amount = sc.nextInt();
                if(atm.balance < withdraw_amount){
                    System.out.println("Not sufficient money: ");
                }else{
                    atm.balance = atm.balance - withdraw_amount;
                }
            } else if(choice == 4){
                System.out.println("Goodbye!");
                break;
            }
        }


        // if correct , show menu check balance, deposit, withdraw, exit

        // keep showing mentu until user chooses exit

        // withdrawal shoudl fail if balance is insufficient

        // what variables do I need?
        // i need an atm pin integer variable and integer balance.
        // how do I check PIN?
        // should already have an integer pin and if that matches input it matches
        // how do I keep showing menu?
        // this is where i am not understanding. a loop until it presses exit. okay
        // what happens on each menu choice?
        // if i click on menu . it checks balance if i click on check balance, depoisti if i click on deposit. like wise
        // and if i click on exit. it closes. and if balance is insuffiencent while withdawing it should print insufficiet
    }
}
