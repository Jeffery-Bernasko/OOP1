// Learning Encapsulation....Encapsulation is to make sure sensitive data is hidden from users
//We achieve that with help of private attributes and provide public get and set methods to access and update the value of a private variable


public class Student {
    // Attributes of the class
    private String name;
    private int age;
    private int level;
    private int studentId;
    private String course;


    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    //Getters
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getCourse() {
        return course;
    }


}
