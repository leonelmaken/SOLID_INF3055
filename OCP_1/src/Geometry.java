public class Geometry {
    private Shape shape;

    public Geometry(Shape shape) {
        this.shape = shape;
    }

    void area(){
        shape.subArea();
    }
    void perimeter(){
        shape.subPerimeter();
    }
}
