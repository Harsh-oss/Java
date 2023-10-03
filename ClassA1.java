import java.util.Scanner;

public class ClassA1 {
    int amount = 10000;
    int withdraw_amt;
    int deposit_amt;
    static Scanner sc = new Scanner(System.in);

    synchronized void withdraw() throws InterruptedException{
        System.out.print("Enter the amount you want to withdraw: ");
        withdraw_amt = sc.nextInt();

        if (amount<withdraw_amt){
            System.out.println("Insufficient Balance \n Balance: "+amount);
            System.out.println("----------------------------------");
            System.out.println("If you want to withdraw "+ withdraw_amt);
            System.out.println("First deposit "+(withdraw_amt-amount)+" or more");
            System.out.println("----------------------------------");

            wait();
            Thread.sleep(1000);
            System.out.println("Amount Credited");
            amount-=amount;
            System.out.println("Withdrawn Successful \n Balance: "+amount);
            System.out.println("----------------------------------");

        }
        else {
            amount-=amount;
            System.out.println("Withdrawn Successful \n Balance: "+amount);
            System.out.println("----------------------------------");

        }
    }
    synchronized void deposit(){
        while(withdraw_amt>amount){
                System.out.print("Deposit: ");
                deposit_amt = sc.nextInt();
                this.amount+=deposit_amt;
                System.out.println("Balance: "+amount);

        }

            System.out.println("Deposit Successful \n Balance: "+amount);
            notify();
            System.out.println("----------------------------------");


    }
}
