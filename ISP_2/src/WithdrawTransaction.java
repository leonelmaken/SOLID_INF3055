public class WithdrawTransaction {
    private UI ui = new BrailleATMUI();

    public void withDraw(){
        ui.requestWithdrawAmount();
    }

    public void montantInsuffisant(){
        ui.informInsuffisientFund();
    }
}
