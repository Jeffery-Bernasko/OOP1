import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.rmi.StubNotFoundException;
import java.util.Scanner;
public class Main {

    //Scanner obj for standard input
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //Creating an object of the car class
        Car myCar = new Car();

        //Student Object
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        //variable for assigning
        String name;
        String email;
        String phoneNumber;
        int accNumber;
        double balance;
        double depositAmount;
        double withdrawalAmount;
        int accountNumber;

        //Bank Account object
        BankAccount acc1 = new BankAccount();


        System.out.print("Please Enter your name: ");
        name = sc.nextLine();

        System.out.print("Please Enter your email: ");
        email = sc.nextLine();

        System.out.print("Please Enter your phone number: ");
        phoneNumber = sc.nextLine();

        System.out.print("Please enter the balance in your account: ");
        balance = sc.nextDouble();

        System.out.print("Please enter the amount to deposit: ");
        depositAmount = sc.nextDouble();

        System.out.print("Please enter the amount to withdraw: ");
        withdrawalAmount = sc.nextDouble();

        //Set fields to various fields from the class
        acc1.setCustName(name);
        acc1.setEmail(email);
        acc1.setPhoneNumber(phoneNumber);
        acc1.setBalance(balance);


        //Print out the results
        System.out.println("Your name is " + acc1.getCustName());
        System.out.println("Your balance is " + acc1.getBalance());
        System.out.println("Your email is " + acc1.getEmail());
        System.out.println("Your phone number is " + acc1.getPhoneNumber());

        acc1.deposit(depositAmount);
        System.out.println();
        acc1.withdrawal(withdrawalAmount);



    //Assigning various fields for students
//        s1.setName("Peter Jeffery Bernasko");
//        s1.setAge(22);
//        s1.setCourse("Computer Science");
//        s1.setLevel(400);
//        s1.setStudentId(20575694);
//
//        s2.setName("Cedric Bansah");
//        s2.setAge(22);
//        s2.setCourse("Computer Science");
//        s2.setLevel(400);
//        s2.setStudentId(20565694);
//
//        s3.setName("Forgive Agbesi");
//        s3.setAge(22);
//        s3.setCourse("Information Technology");
//        s3.setLevel(400);
//        s3.setStudentId(20557844);
//
//        //Getting the various fields assigned to students and print
//
//        System.out.println("Details of Student1");
//        System.out.println(s1.getName());
//        System.out.println(s1.getAge());
//        System.out.println(s1.getLevel());
//        System.out.println(s1.getCourse());
//        System.out.println(s1.getStudentId());
//
//        System.out.println();
//
//        System.out.println("Details of Student2");
//        System.out.println(s2.getName());
//        System.out.println(s2.getAge());
//        System.out.println(s2.getLevel());
//        System.out.println(s2.getCourse());
//        System.out.println(s2.getStudentId());
//
//        System.out.println();
//
//        System.out.println("Details of Student3");
//        System.out.println(s3.getName());
//        System.out.println(s3.getAge());
//        System.out.println(s3.getLevel());
//        System.out.println(s3.getCourse());
//        System.out.println(s3.getStudentId());

        //Accessing the honk method from the vehicle class
       // myCar.honk();
        //Accessing the methods of the class
        // myCar.fullThrottle();
        //   myCar.speed(200);
        //
        //
        //   myCar.setColor("Blue");
        //   myCar.setModel("Camry");
        //   myCar.setSpeed(30);
        //
        //        System.out.println("Model is " + myCar.getModel());
        //        System.out.println("The color is " + myCar.getColor());
        //        System.out.println("The car is moving at a speed of " + myCar.getSpeed() + "Km/h");
    }

}