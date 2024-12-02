public class Square implements Drawable{
    private float side;

    public Square(float side){
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Draw a square");
    }
    public float calculateArea(){
        return side * side;
    }
}
