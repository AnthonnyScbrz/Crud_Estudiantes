package main;

import add.Add;
import input.Input;
import model.Student;
import output.Output;
import validator.Validator;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int optionMenu;
    final static int USER_ADD = 1;
    final static int USER_DELETE = 2;
    final static int MODIFY_SCORE = 3;
    final static int USER_LIST = 4 ;
    final static int EXIT = 5;
    public final static int STUDENT_NUMBER = 2;
    public static HashMap<Integer, Student> students;
    public static void main(String[] args) {

        students = new HashMap<>();
        boolean userWantToExit= false;

        do {

        boolean correctOption = false;

        do {
        showMenu();
        optionMenu=selectValue();
        correctOption = validateOpcion();
        }while(!correctOption);

        if (optionMenu==EXIT){
        userWantToExit=true;
        }
        switch (optionMenu){
            case USER_ADD:
                addUser();
                break;
            case USER_DELETE: break;
            case MODIFY_SCORE: break;
            case USER_LIST: break;
        }

        }while(userWantToExit);

    }

    private static void addUser() {
        Add.adduser();
    }

    public static void showMenu(){
        Output.showMenu();
    }
    public static int selectValue(){
        Output.valueRequest();
        return Input.scanValue();
    }
    public static boolean validateOpcion(){
    return Validator.validateOpcion(optionMenu);
    }
}