public class Circle extends Shape{
    private float radius;

    public Circle(float radius){
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println("Draw a circle");
    }
    public float calculateArea(){
        return (float) (Math.PI * radius * radius);
    }
}
