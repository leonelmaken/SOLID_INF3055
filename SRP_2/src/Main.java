public class Main {
    public static void main(String[] args) {
        CsvDataImporter csvDataImporter = new CsvDataImporter();
        csvDataImporter.Import("données.txt");
        DataImporter dataImporter = new DataImporter(new CvsFileLoader(), new DataGateway());
        dataImporter.Import("file.txt");
    }
}