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
public class BankAccount {

    int id;
    String name;
    double balance;

    void topUpAccount(double addBalance) {
        balance += addBalance;
    }

    void removeFromAccount(double addBalance) {
        balance -= addBalance;
    }

    void printBalance() {
        System.out.println("Balance: " + Math.round(balance*100.0)/100.0);
    }
}
