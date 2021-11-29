package StudentDBforOOP;

import java.util.Random;

public class StudentDB {

    public static void main(String[] args) {

        Student stu1 = new Student("Tom", "123456789");
        stu1.enroll("Math");
        stu1.enroll("Geo");
        stu1.enroll("Phys");

        stu1.showCourses();
        stu1.checkBalance();
        stu1.pay(600);
        System.out.println(stu1.toString());

        //Student stu2 = new Student("Bob", "123456454");
        //stu2.enroll("Math");


    }
}

class Student {

    // very much change
    private String state;
    private String city;
    private String phone;
    private String courses = "";
    private int balance = 0;
    private static final int costOfCourse = 800;
    private String name;
    private String SSN;
    private String email;           //Automatically create an email ID based on the name
    private static int iD = 1000; // internal ID
    private String userID;        // Generate a user ID that is combination of:
    // 1. Static ID
    // 2. random 4-digit number between 1000 and 9000
    // 3. and last 4 of SSN

    //constructor
    public Student(String name, String SSN) {
        this.name = name;
        this.SSN = SSN;
        System.out.println("New account is stored in the Database");
        iD++;
        setEmail();
        generateUserID();
    }

    private void setEmail() {
        email = name.toLowerCase() + "." + iD + "@gmail.com";
        System.out.println("The user email is: " + email);
    }

    public String getEmail() {
        return email;
    }

    private void generateUserID() {
        int random = generateRandomNumber();
        userID = iD + "" + random + SSN.substring(6, 9);
        System.out.println("Your account number is: " + userID);
    }

    private int generateRandomNumber() {
        Random randomNumber = new Random();
        //System.out.println(i);
        return 1000 + randomNumber.nextInt(9000);
    }

    public void enroll(String course) {
        this.courses = this.courses + "\n" + course;
        System.out.println("The " + course + " is enrolled.");
        balance = balance + costOfCourse;
    }

    public void pay(int amount) {
        balance = balance - amount;
        System.out.println("Paying for the course. The total amount:  " + amount);
        checkBalance();
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public void showCourses() {
        System.out.println("Current courses:" + courses);
    }

    public String toString() {
        return "[ Name: " + name + " ]\n[ Courses: " + courses + " ]\n" + "[ Balance: " + balance + " ]\n";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public double getBalance() {
        return balance;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}