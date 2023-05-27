public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Geometry geometry = new Geometry(circle);
        geometry.area();
        geometry.perimeter();
    }
}