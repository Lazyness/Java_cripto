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
public class BancAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        MyAccount.id = 4;
        MyAccount.name ="Dima";
        MyAccount.balance = 12.5;
        MyAccount.printBalance();
        MyAccount.topUpAccount(20.3);
        MyAccount.printBalance();
        MyAccount.removeFromAccount(32.7);
        MyAccount.printBalance();
        //...
        
    }
}
