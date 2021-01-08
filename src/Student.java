import java.util.ArrayList;
import java.util.Random;
import java.util.zip.DataFormatException;

public class Student extends Person {

    private static ArrayList<Student> whitehatSchool;
    private String studentID;
    private Random random;


    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.studentID = randomIdGenerator();



    }
    public static void addWhiteHat(Student student) throws DataFormatException {
        whitehatSchool = new ArrayList<>();
        if(student.getAge() > 18){
            throw new DataFormatException("Student to old to join");
        }
        whitehatSchool.add(student);
    }


    public void printWhitehatStudents(){
        for(Student name : whitehatSchool ){
            System.out.println(name);
        }
    }

    public String getID(){
        return  this.studentID;
    }

    public String studentInfo(Student student){
        return "This is your student details \n" + "Full Name: " + student.getFirstName() + " " + student.getLastName() +
                "\n" + "I.D number: " + this.getID();
    }

    private String randomIdGenerator(){
        this.random = new Random();
        String code = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String id = "";
        while(id.length() < 9){
            id += code.charAt(random.nextInt(code.length()));
        }
        return id;
    }
}
