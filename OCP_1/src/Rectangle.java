public class Rectangle implements Shape{
    private float longueur, largeur;

    public Rectangle(float longueur, float largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public void subArea() {
        System.out.println("L'aire de ce cercle est de : "+longueur*largeur+" m2.");
    }

    @Override
    public void subPerimeter() {
        System.out.println("Le périmètre de ce cercle est de : "+(longueur+largeur)*2+" m.");
    }
}
