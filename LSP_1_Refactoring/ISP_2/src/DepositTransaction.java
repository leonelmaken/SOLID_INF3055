public class DepositTransaction {
    private UI ui = new ScreenATMUI();

    public void faireDepot(){
        ui.requestDepositAmount();
    }
}
