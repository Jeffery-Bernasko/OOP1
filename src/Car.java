// A Car class with attributes( basically variables) and methods
//public is an access modifier that allows your attributes to be accessible outside the class

public class Car {
    //attributes of the class
    public String color;
    public int speed;
    public String throttle;

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
