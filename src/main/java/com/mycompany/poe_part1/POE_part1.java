/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe_part1;
import java. util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class POE_part1 {

// this is the main method where the scanner will be imported to prompt the user for input
   
    public static void main(String args[]) {
   Scanner scanner = new Scanner(System.in);    
   
 
    
// VARIABLES DECLARED AND PASSED ON TO CONSTRUCTOR USING THE SCANNER 
    
    String firstname = "";
    String lastname = "";
    String username = "";
    String cellnumber = "";
    String password = "";
    String enteredUsername = "";
    String enteredPassword = "";

// Instance of login class in the main method 

Login login = new Login(username,cellnumber,password,firstname,lastname,enteredUsername,enteredPassword); //PARAMETERS ASSIGNED TO THE LOGIN CLASS 

    firstname = Login.checkFirstName(firstname); //Method handling entry of the firstname variable

    lastname = Login.checkLastName(lastname);    //Method handling the entry lastname variable


//Loops which execute until the user enters correct details according to the prompts 

do{ System.out.println("\nEnter your username: Username must equal five characters and contain an underscore ");
    username = scanner.nextLine();{Login.registerUser(username);}}while(!Login.checkUsername(username));
 

do{ System.out.println("\nEnter your cellnumber: Cellphone number must start with +27 and be 10 digits in length ");
    cellnumber = scanner.nextLine();{Login.registerUser(cellnumber,username);}}while(!Login.checkCellnumber(cellnumber));



do{ System.out.println("\nEnter your password: Password must equal 8 characters in length,contain a number,capital letter and contain a special character ");
    password = scanner.nextLine();{Login.registerUser(password,username,cellnumber);}}while(!Login.checkPassword(password));


//REGISTER USER METHOD INTERNALLY CALLS THE LOGIN USER METHOD 
   
    Login.registerUser(username, cellnumber, password, firstname, lastname, true);
   
    Login.returnLoginStatus(enteredUsername, username, password, enteredPassword, firstname, lastname); //RETURNS LOGIN STATUS
 
// END OF PROGRAM    
    
    scanner.close();  


    }
}
