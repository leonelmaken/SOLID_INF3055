public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,5);
        System.out.println("Rectangle 1 - Width : "+rectangle.getWidth()+" Height : "+rectangle.getHeight());
        rectangle.setWidth(24);
        System.out.println("Rectangle 1 - Width : "+rectangle.getWidth()+" Height : "+rectangle.getHeight());
        Rectangle rect;
        rect = new Carre();
        rect.setWidth(40);
        System.out.println("Rectangle - Carre - Width : "+rect.getWidth()+" Height : "+rect.getHeight());
        Carre carre = new Carre();
        carre.setWidth(4);
        carre.setHeight(4);
        System.out.println("Carre - Width : "+carre.getWidth()+" Height : "+carre.getHeight());
        carre.setHeight(14);
        System.out.println("Carre - Width : "+carre.getWidth()+" Height : "+carre.getHeight());
        Square square = new Square(new Rectangle());
        square.setSize(5);
        System.out.println("Square - Width : "+square.getRectangle().getWidth()+" Height : "+square.getRectangle().getHeight());
    }
}