/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_part1;  // package declaration

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Login {

    // Instance attributes
    private String enteredUsername;
    private String enteredPassword;
    private String username;
    private String cellnumber;
    private String password;
    private String firstname;
    private String lastname;

    // Constructor with initialized attributes
    public Login(String username, String cellnumber, String password, String firstname,
                 String lastname, String enteredUsername, String enteredPassword) {
        this.enteredUsername = enteredUsername;
        this.enteredPassword = enteredPassword;
        this.username = username;
        this.cellnumber = cellnumber;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Method (loop) preventing firstname from being empty
    public String checkFirstName(String firstname) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter your firstname:");
        firstname = scanner.nextLine();

        if (firstname.isEmpty()) {
            do {
                System.out.println("\nfirstname cannot be empty!!!\nEnter it again:");
                firstname = scanner.nextLine();
            } while (firstname.isEmpty());
        } else {
            System.out.println("\nfirstname captured");
        }

        return firstname;
    }

    // Method (loop) preventing lastname from being empty
    public String checkLastName(String lastname) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter your lastname:");
        lastname = scanner.nextLine();

        if (lastname.isEmpty()) {
            do {
                System.out.println("\nlastname cannot be empty!!!\nEnter it again:");
                lastname = scanner.nextLine();
            } while (lastname.isEmpty());
        } else {
            System.out.println("\nlastname captured");
        }

        return lastname;
    }

    // Username format check
    public boolean checkUsername(String username) {
        if (username.length() == 5 &&
            username.contains("_") &&
            username.matches(".*[a-z]*.")) {
            return true;
        } else {
            return false;
        }
    }

    // Basic regular expression for the cellphone number - coded by Meta AI - simplified by me for ease of use
    public boolean checkCellnumber(String cellnumber) {
        if (cellnumber.matches("^\\+27\\d{10}$")) {
            return true;
        } else {
            return false;
        }
    }

    // Password format check
    public boolean checkPassword(String password) {
        if (password.length() == 8 &&
            password.matches(".*[A-Z]*.") &&
            password.matches(".*[~!@#$%^&*()_+=-`?><,./';:]*.") &&
            password.matches(".*[0-9]*.")) {
            return true;
        } else {
            return false;
        }
    }

    // Overloaded method for registering the username
    public String registerUser(String username) {
        if (!checkUsername(username)) {
            System.out.println("\nIncorret username format: ensure it is 5 characters and contains an underscore");
        } else {
            System.out.println("\nUSERNAME SUCCESSFULLY CAPTURED");
        }
        return username;
    }

    // Overloaded method for registering the cellphone number
    public String registerUser(String cellnumber, String username) {
        if (!checkCellnumber(cellnumber)) {
            System.out.println("\nIncorrect cellphone number format: ensure it contains national code and is 10 digits");
        } else {
            System.out.println("\nCELLPHONE NUMBER SUCCESSFULLY CAPTURED");
        }
        return cellnumber;
    }

    // Overloaded method for registering password
    public String registerUser(String password, String username, String cellnumber) {
        if (!checkPassword(password)) {
            System.out.println("\nIncorrect password format: ensure it contains a capital letter, numbers, special characters and is 8 characters in length");
        } else {
            System.out.println("PASSWORD SUCCESSFULLY CAPTURED");
        }
        return password;
    }

    // Overloaded method for confirmation of successful registration or failed registration
    public String registerUser(String username, String cellnumber, String password,
                               String firstname, String lastname, boolean isRegistered) {
        if (checkPassword(password) && checkCellnumber(cellnumber) && checkUsername(username)) {
            System.out.println("\nRegistration successfull");
            isRegistered = true;
        } else {
            System.out.println("\nRegistration UNSUCESSFUL : please fix the errors");
            isRegistered = false;
        }
        return firstname;
    }

    // Method for logging in the user upon successful registration
    public boolean loginUser(String enteredUsername, String username, String password, String enteredPassword) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter your Username to login");
        enteredUsername = scanner.nextLine();

        System.out.println("\nEnter your PASSWORD to login");
        enteredPassword = scanner.nextLine();

        if (enteredPassword.equals(password) && enteredUsername.equals(username)) {
            System.out.println("\nUSERNAME and PASSWORD captured successfully");
            return true;
        } else {
            System.out.println("\nWrong USERNAME or PASSWORD");
            return false;
        }
    }

    // Method confirming successful or failed login, and greeting the user on success
    public String returnLoginStatus(String enteredUsername, String username, String password,
                                    String enteredPassword, String firstname, String lastname) {
        if (!loginUser(enteredUsername, username, password, enteredPassword)) {
            System.out.println("\nLogin unsucessful");
        } else {
            System.out.println("\n<<<<<Login SUCCESSFULL: WELCOME BACK>>>>> " + firstname + " " + lastname
                    + "\nIt is great to see you again!!!");
        }
        return password;
    }
}
