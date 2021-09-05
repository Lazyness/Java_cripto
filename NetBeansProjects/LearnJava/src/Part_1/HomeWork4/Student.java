/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part_1.HomeWork4;

/**
 *
 * @author dimon
 */
public class Student {

    private int numberStudentTicket;
    String firstName;
    String lastName;
    int yearStudy;
    double avarageGradeMath;
    double avarageGradeEconomic;
    double avarageGradeEnglish;

    public void setNumberStudentTicket(int value) {
        this.numberStudentTicket = value;
    }

    public int getNumberStudentTicket() {
        return numberStudentTicket;
    }

    public double avarageGrateStudent() {
        return (avarageGradeEconomic + avarageGradeEnglish + avarageGradeMath) / 3;
    }

    public void printData() {
        System.out.println("firstName: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("numberStudentTicket: " + getNumberStudentTicket());
        System.out.println("yearStudy: " + yearStudy);
        System.out.println("avarageGradeEconomic: " + avarageGradeEconomic);
        System.out.println("avarageGradeEnglish: " + avarageGradeEnglish);
        System.out.println("avarageGradeMath: " + avarageGradeMath);
        System.out.println("avarageGrateStudentAll: " + avarageGrateStudent());
        System.out.println("|*********************|");
    }

    public Student(int numberStudentTicket,
            String firstName,
            String lastName,
            int yearStudy,
            double avarageGradeMath,
            double avarageGradeEconomic,
            double avarageGradeEnglish) {
        this.numberStudentTicket = numberStudentTicket;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearStudy = yearStudy;
        this.avarageGradeMath = avarageGradeMath;
        this.avarageGradeEconomic = avarageGradeEconomic;
        this.avarageGradeEnglish = avarageGradeEnglish;
    }

    public Student(int numberStudentTicket,
            String firstName,
            String lastName,
            int yearStudy
    ) {
        this(numberStudentTicket, firstName, lastName, yearStudy, 0, 0, 0);
    }

    public Student() {
        this(0, null, null, 0, 0, 0, 0);
    }
}
