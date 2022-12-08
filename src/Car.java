// A Car class with attributes( basically variables) and methods
//private is an access modifier that is used to set access level for classes, attributes, methods and constructors

public class Car {
    //attributes of the class
    private String color;
    private int speed;
    private String model;

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

    public void color(String color)
    {
        System.out.println("The color of the car is " + color);
    }

    // Setters
    public void setColor(String color){
        this.color = color;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setModel(String model){
        this.model = model;
    }


    // Getters
    public String getColor(){
        return this.color;
    }

    public int getSpeed(){
        return this.speed;
    }

    public String getModel(){
        return this.model;
    }
}
