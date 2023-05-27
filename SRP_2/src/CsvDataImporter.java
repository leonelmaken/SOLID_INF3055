public class CsvDataImporter {
    public CsvDataImporter(){

    }

    public void Import(String file){
        System.out.println("Importation du fichier : "+file+" en cours");
        this.loadCSVFile(file);
        this.storeintoDatabase();
    }

    private void loadCSVFile(String file){
        System.out.println("Chargement du fichier : "+file+" en cours.");
    }

    private void storeintoDatabase(){
        Database database = new Database();
        database.sauvegarde();
    }
}
