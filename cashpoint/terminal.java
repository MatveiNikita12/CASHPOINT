package cashpoint;

import java.util.Scanner;

public class terminal {
    public static void main(String[] args) {
        CashOperationInterface op = new CashOperationImpl();

        int cardNumber = 647146;
        int cardPIN = 1231;

        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to CashBank");
        System.out.print("Enter card number: ");
        int numberCard = in.nextInt();
        System.out.print("Enter PIN: ");
        int pinCard = in.nextInt();
        if((cardNumber == numberCard) && (cardPIN==pinCard)){
            while (true){
                System.out.println("1. View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exiet");
                System.out.print("Enter choice: ");
                int choice = in.nextInt();
                if(choice==1){
                    op.viewBalance();
                }
                else if(choice==2){
                    System.out.println("Enter amount to withdraw");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                }
                else if(choice==3){
                    System.out.print("Enter Amount to Deposit");
                    double depositAmount = in.nextDouble();
                    op.depositAmount(depositAmount);


                }
                else if(choice==4){
                    op.viewMiniStatement();
                }
                else if(choice==5){
                    System.out.println("Collect your card\nThank you for ypu using our Bank");
                    System.exit(0);
                }
                else {
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
            System.out.println("Incorrect card number or pin");
            System.exit(0);

        }
    }
}
