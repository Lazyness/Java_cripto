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
public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Kogol", 19, 13_000, "Oracle");
        Employee employee2 = new Employee(2, "Harkownic", 19, 14_000, "Annomims");
        employee1.printSalary();
        employee2.printSalary();
        
        employee1.growUpSalaryTwice();
        employee2.growUpSalaryTwice();
        
        employee1.printSalary();
        employee2.printSalary();
    }
}
