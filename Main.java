package rectangle;

/*
Write a class that create instances of the 'Rectangle' class to find the
total area of two rooms in a house.
 */
public class Main {

    public static void main(String[] args) {
        Rectangle room1 = new Rectangle();  // Object of constructor without accepting parameter
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRooms1 = room1.calculateArea();
        double perimeterOfRoom1 = room1.calculatePerimeter();
        System.out.println(areaOfRooms1);
        System.out.println(perimeterOfRoom1);

        System.out.println("************************************************");

        Rectangle room2 = new Rectangle(30, 75); // Object of constructor that accept parameters
        double areaOfRoom2 = room2.calculateArea();
        double perimeterOfRoom2 = room2.calculatePerimeter();
        System.out.println(areaOfRoom2);
        System.out.println(perimeterOfRoom2);
    }
}
