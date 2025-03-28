package model;

public class Student {
    private String firstName;
    private String lastName;
    private String firstCurse;
    private int age;
    private String birthday;
    protected int firstScore;
    private String secondCurse;
    protected int secondScore;

    public Student(String firstName,String lastName ,int age, String birthday, String firstCurse, int firstScore, String secondCurse, int secondScore) {
        this.firstName = firstName;
        this.lastName=lastName;
        this.age = age;
        this.birthday = birthday;
        this.firstCurse = firstCurse;
        this.firstScore = firstScore;
        this.secondCurse = secondCurse;
        this.secondScore = secondScore;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return  lastName;
    }

    public String getFirstCurse() {
        return firstCurse;
    }

    public int getFirstScore() {
        return firstScore;
    }

    public String getSecondCurse() {
        return secondCurse;
    }

    public int getSecondScore() {
        return secondScore;
    }

    public void setFirstScore(int firstScore) {
        this.firstScore = firstScore;
    }

    public void setSecondScore(int secondScore) {
        this.secondScore = secondScore;
    }

}
