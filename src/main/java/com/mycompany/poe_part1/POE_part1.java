/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe_part1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class POE_part1 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Variables declared and passed on to constructor using the scanner
        String firstname = "";
        String lastname = "";
        String username = "";
        String cellnumber = "";
        String password = "";
        String enteredUsername = "";
        String enteredPassword = "";

        // Instance of Login class
        Login login = new Login(username, cellnumber, password, firstname, lastname, enteredUsername, enteredPassword);

        firstname = login.checkFirstName(firstname);
        lastname = login.checkLastName(lastname);

        // Loops which execute until the user enters correct details according to the prompts

        do {
            System.out.println("\nEnter your username: Username must equal five characters and contain an underscore");
            username = scanner.nextLine();
            login.registerUser(username);
        } while (!login.checkUsername(username));

        do {
            System.out.println("\nEnter your cellnumber: Cellphone number must start with +27 and be 10 digits in length");
            cellnumber = scanner.nextLine();
            login.registerUser(cellnumber, username);
        } while (!login.checkCellnumber(cellnumber));

        do {
            System.out.println("\nEnter your password: Password must equal 8 characters in length, contain a number, capital letter and a special character");
            password = scanner.nextLine();
            login.registerUser(password, username, cellnumber);
        } while (!login.checkPassword(password));

        login.registerUser(username, cellnumber, password, firstname, lastname, true);

        login.returnLoginStatus(enteredUsername, username, password, enteredPassword, firstname, lastname);

        scanner.close();
    }
}
