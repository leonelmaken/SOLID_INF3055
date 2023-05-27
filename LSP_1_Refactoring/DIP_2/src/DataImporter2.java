public class DataImporter2 {
    private FileLoader fileLoader;
    private Gateway gateway;

    public DataImporter2(FileLoader fileLoader, Gateway gateway) {
        this.fileLoader = fileLoader;
        this.gateway = gateway;
    }

    public void Import(String file){
        System.out.println("Importation du fichier : "+file+" en cours");
        fileLoader.loadCSVFile(file);
        gateway.storeIntoDatabase();
    }
}
