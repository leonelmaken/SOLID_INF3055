public class ScreenATMUI implements UI{
    @Override
    public void requestDepositAmount() {
        System.out.println("Je suis ScreenATMUI requestDepositAmount");
    }

    @Override
    public void requestWithdrawAmount() {
        System.out.println("Je suis ScreenATMUI requestWithdrawAmount");
    }

    @Override
    public void informInsuffisientFund() {
        System.out.println("Je suis ScreenATMUI informInsuffisientFund");
    }
}
