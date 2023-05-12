package cashpoint;

public interface CashOperationInterface {
    void viewBalance();
    void withdrawAmount(double withdrawAmount);
    void depositAmount(double deposit);
    void viewMiniStatement();
}
