/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part_1.HomeWork4;
//import Part_1.HomeWork4.Student;

/**
 *
 * @author dimon
 */
public class StudentTest {

    public static void main(String[] args) {
//        Student std1 = new Student();
//        Student std2 = new Student();
//        Student std3 = new Student();
//
//        std1.firstName = "Dima";
//        std1.lastName = "Kogol";
//        std1.setNumberStudentTicket(8);
//        std1.yearStudy = 3;
//        std1.avarageGradeMath = 9.5;
//        std1.avarageGradeEnglish = 7.5;
//        std1.avarageGradeEconomic = 5;
//
//        std2.firstName = "Rick";
//        std2.lastName = "Logok";
//        std2.setNumberStudentTicket(45);
//        std2.yearStudy = 4;
//        std2.avarageGradeMath = 10.5;
//        std2.avarageGradeEnglish = 11.5;
//        std2.avarageGradeEconomic = 2;
//
//        std3.firstName = "Kiril";
//        std3.lastName = "Koran";
//        std3.setNumberStudentTicket(12);
//        std3.yearStudy = 2;
//        std3.avarageGradeMath = 10.5;
//        std3.avarageGradeEnglish = 5.5;
//        std3.avarageGradeEconomic = 4;
//        
//        std1.printData();
//        std2.printData();
//        std3.printData();
        Student std1 = new Student();
        Student std2 = new Student(4, "Karasik", "Smart", 4);
        Student std3 = new Student(15, "Kogol", "Dimoooon", 3, 4.1, 5.4, 9.3);
        std1.printData();
        std2.printData();
        std3.printData();
    }

}
