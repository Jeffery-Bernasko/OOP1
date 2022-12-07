// A Car class with attributes( basically variables) and methods
//public is an access modifier that is used to set access level for classes, attributes, methods and constructors

public class Car {
    //attributes of the class
    public String color;
    public int speed;
    public String throttle;

    //Creating a constructor for the class
    public Car(){

    }

    //Methods of the class

    public void fullThrottle(){
        System.out.println("The car is moving as fast as it can");
    }

    public void speed(int speed)
    {
        System.out.println("Max speed is: " + speed);
    }

    public void color(String color){
        System.out.println("The color of the car is " + color);
    }

}
