public class Circle implements Shape{
    private float rayon;

    public Circle(float rayon) {
        this.rayon = rayon;
    }

    @Override
    public void subArea() {
        System.out.println("L'aire de ce cercle est de : "+3.14*Math.sqrt(rayon)+" m2.");
    }

    @Override
    public void subPerimeter() {
        System.out.println("Le périmètre de ce cercle est de : "+2*3.14*rayon+" m.");
    }
}
