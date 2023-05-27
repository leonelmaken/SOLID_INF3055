public class BrailleATMUI implements UI{
    @Override
    public void requestDepositAmount() {
        System.out.println("Je suis BrailleATMUI requestDepositAmount");
    }

    @Override
    public void requestWithdrawAmount() {
        System.out.println("Je suis BrailleATMUI requestWithdrawAmount");
    }

    @Override
    public void informInsuffisientFund() {
        
    }
}
