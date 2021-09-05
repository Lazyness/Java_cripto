/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part_1.HomeWork6;

/**
 *
 * @author dimon
 */
public class SumClass {

//    private double sum() {
//        return number1+number2+number3+number4;
//    }
    private double sum(double firstNumber, double secondNumber) {
        System.out.print("sum 2 params: ");
        return firstNumber + secondNumber;
    }

    private double sum(double firstNumber, double secondNumber, double thirdNumber) {
        System.out.print("sum 3 params: ");
        return firstNumber + secondNumber + thirdNumber;
    }

    private double sum(double firstNumber, double secondNumber, double thirdNumber, double fourthNumber) {
        System.out.print("sum 4 params: ");
        return firstNumber + secondNumber + thirdNumber + fourthNumber;
    }

    private double sum(double firstNumber) {
        System.out.print("sum 0 params: ");
        return firstNumber;
    }

    private double sum() {
        System.out.print("sum 0 params: ");
        return 0;
    }

    public void printSum(double variable) {
        System.out.println(variable);
    }
    private double number1;
    private double number2;
    private double number3;
    private double number4;

//    public SumClass(double firstNumber, double secondNumber, double thirdNumber, double fourthNumber) {
//        number1 = firstNumber;
//        number2 = secondNumber;
//        number3 = thirdNumber;
//        number4 = fourthNumber;
//    }
//
//    public SumClass(double firstNumber, double secondNumber, double thirdNumber) {
//        this(firstNumber, secondNumber, thirdNumber, 0);
//    }
//
//    public SumClass(double firstNumber, double secondNumber) {
//        this(firstNumber, secondNumber, 0, 0);
//    }
//
//    public SumClass(double firstNumber) {
//        this(firstNumber, 0, 0, 0);
//    }
//
//    public SumClass() {
//        this(0, 0, 0, 0);
//    }
    public static void main(String[] args) {
        SumClass sc1 = new SumClass();
        sc1.printSum(sc1.sum(5,5,6));

//        SumClass sc2 = new SumClass(5);
//        sc2.printSum(sc2.sum());
//
//        SumClass sc3 = new SumClass(5, 6);
//        sc3.printSum(sc3.sum());
//
//        SumClass sc4 = new SumClass(5, 6, 4);
//        sc4.printSum(sc4.sum());
//
//        SumClass sc5 = new SumClass(5, 6, 4, 9);
//        sc5.printSum(sc5.sum());
    }
}
