package add;

import input.Input;
import model.Student;
import output.Output;

import java.util.HashMap;

public class Add {
    private static HashMap<Integer,Student> studenHashmap;
    public static Object[] arrayStudent;

    static {
        studenHashmap = new HashMap<>();
    }

    public static HashMap<Integer, Student> hashMapAccess(){
        return studenHashmap;
    }

    public static void adduser(){
       //for (int i =0;i<main.Main.STUDENT_NUMBER;i++){
            Output.fullNameRequest();
            String firstName = Input.getFullName();
            Output.lastNameRequest();
            String lastName=Input.getLastName();
            Output.AgeRequest();
            int age = Input.getAge();
            Output.birthdayRequest();
            String birthday= Input.getBirthday();
            Output.curseRequest();
            String firstCurse = Input.getCurse();
            Output.ScoreRequest();
            int firstScore = Input.getScore();
            Output.curseRequest();
            String secondCurse = Input.getCurse();
            Output.ScoreRequest();
            int secondScore = Input.getScore();

            arrayStudent = new Object[8];
            arrayStudent[0] = firstName;
            arrayStudent[1] = lastName;
            arrayStudent[2] = age;
            arrayStudent[3] = birthday;
            arrayStudent[4] = firstCurse;
            arrayStudent[5] = firstScore;
            arrayStudent[6] = secondCurse;
            arrayStudent[7] = secondScore;



            //main.Main.students.put(1, new Student(firstName,lastName,age,birthday,firstCurse,firstScore,secondCurse,secondScore));
       //}
        Output.confirmationMessage();
    }
}
