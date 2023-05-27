public class Main {
    public static void main(String[] args) {
        Voilier voilier = new Voilier("Diesel",null);
        voilier.calculerConso();
        Moto moto = new Moto("Gasoil",new EquipementMoteur(5));
        moto.calculerConso();
        moto.getEquipementMoteur().démarrer();
        moto.getEquipementMoteur().freiner();
    }
}