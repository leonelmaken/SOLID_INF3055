public class Main {
    public static void main(String[] args) {
        DepositTransaction depositTransaction = new DepositTransaction();
        depositTransaction.faireDepot();
        WithdrawTransaction withdrawTransaction = new WithdrawTransaction();
        withdrawTransaction.withDraw();
    }
}