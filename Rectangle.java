package rectangle;

public class Rectangle {
    private double length;
    private double width;

    // Setting two Constructors. This has a default value
   public Rectangle(){
       length = 1;
       width = 1;
   }

    // Without a default value, accept user predefine values
    public  Rectangle(double length, double width){
        setLength(length);
        setLength(width);

    }

    // Methods
  public  double calculatePerimeter(){
        return  (2 * length) + ( 2 * width);
    }
   public double calculateArea(){
        return  length * width;
    }
   public double getLength(){
        return  length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

}
