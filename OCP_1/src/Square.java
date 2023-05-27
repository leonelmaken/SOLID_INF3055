public class Square implements Shape{
    private float cote;

    public Square(float cote) {
        this.cote = cote;
    }

    public void subArea() {
        System.out.println("L'aire de ce carré est de : "+Math.sqrt(cote)+" m2.");
    }

    @Override
    public void subPerimeter() {
        System.out.println("Le périmètre de ce carré est de : "+4*cote+" m.");
    }
}
