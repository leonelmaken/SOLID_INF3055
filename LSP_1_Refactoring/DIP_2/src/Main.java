public class Main {
    public static void main(String[] args) {
        DataImporter dataImporter = new DataImporter(new CsvFileLoader(), new DataGateway());
        dataImporter.Import("fichier.txt");

        DataImporter2 dataImporter2 = new DataImporter2(new CsvFileLoader2(),new DataGateway2());
        dataImporter2.Import("données.txt");
    }
}