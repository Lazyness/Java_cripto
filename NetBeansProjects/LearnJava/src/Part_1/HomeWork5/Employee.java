/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part_1.HomeWork5;

/**
 *
 * @author dimon
 */
public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int idEmployee, String surnameEmployee, int ageEmployee, double salaryEmploye, String departmentEmploye) {
        id = idEmployee;
        surname = surnameEmployee;
        age = ageEmployee;
        salary = salaryEmploye;
        department = departmentEmploye;
    }

    double growUpSalaryTwice() {
        return salary *= 2;
    }

    void printSalary() {
        System.out.println("Salary " + surname + ": " + salary);
    }

}
