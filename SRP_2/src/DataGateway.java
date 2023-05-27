public class DataGateway {
    public DataGateway() {
    }

    public void storeIntoDatabase(){
        Database database = new Database();
        database.sauvegarde();
    }

}