public class DataImporter {
    private CvsFileLoader cvsFileLoader;
    private DataGateway dataGateway;

    public DataImporter(CvsFileLoader cvsFileLoader, DataGateway dataGateway) {
        this.cvsFileLoader = cvsFileLoader;
        this.dataGateway = dataGateway;
    }

    public void Import(String file){
        System.out.println("Importation du fichier : "+file+" en cours");
        this.cvsFileLoader.loadCSVFile(file);
        this.dataGateway.storeIntoDatabase();
    }
}
