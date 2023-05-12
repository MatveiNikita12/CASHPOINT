package cashpoint;

import java.util.HashMap;
import java.util.Map;

public class CashOperationImpl implements CashOperationInterface{
    cashpoint cash = new cashpoint();
    Map<Double, String> ministmt = new HashMap<>();
    @Override
    public void viewBalance() {

        System.out.println("Available Balance is: "+cash.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount%500==0){
            if(withdrawAmount<=cash.getBalance()){
                ministmt.put(withdrawAmount, " Amount Withdrawn");
                System.out.println("Collect the Cash "+withdrawAmount);
                cash.setBalance(cash.getBalance()-withdrawAmount);
                viewBalance();
            }
            else {
                System.out.println("Insufficient Balance !!!");
            }
        }else {
            System.out.println("Please enter amount in multipal of 500");
        }
    }

    @Override
    public void depositAmount(double deposit) {
        ministmt.put(deposit, " Amount Deposited");
        System.out.println(deposit+" depositedSuccessfully!!");
        cash.setBalance(cash.getBalance()+deposit);
        viewBalance();

    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double,String> m:ministmt.entrySet()){ //??
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}


