public class DataImporter {
    private CsvFileLoader csvFileLoader;
    private DataGateway dataGateway;

    public DataImporter(CsvFileLoader csvFileLoader, DataGateway dataGateway) {
        this.csvFileLoader = csvFileLoader;
        this.dataGateway = dataGateway;
    }

    public void Import(String file){
        System.out.println("Importation du fichier : "+file+" en cours");
        this.csvFileLoader.loadCSVFile(file);
        this.dataGateway.storeIntoDatabase();
    }
}
