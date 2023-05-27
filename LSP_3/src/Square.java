public class Square{
    private Rectangle rectangle;

    public Square(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setSize(int s){
        this.getRectangle().setWidth(s);
        this.getRectangle().setHeight(s);
    }
}
