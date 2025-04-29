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
// Class attributes
public class Login {
private static String enteredUsername;
private static String enteredPassword;
private static String username;
private static String cellnumber;
private static String password;
private static String firstname;       
private static String lastname;       
        

//Constructor with initialzed attributes
public Login(String username,String cellnumber,String password,String firstname,String lastname,String enteredUsername,String enteredPassword){
this.enteredUsername = enteredUsername;
this.enteredPassword = enteredPassword;
this.username = username;
this.cellnumber = cellnumber;        
this.password = password;        
this.firstname = firstname;  
this.lastname = lastname;        
    }        
 
//Method (loop) preventing firstname and lastname being empty 

public static String checkFirstName(String firstname){
            Scanner scanner = new Scanner(System.in);
        
  System.out.println("\nEnter your firstname:");
  firstname = scanner.nextLine();
        
        
        if (firstname.isEmpty()) {
        
    do{System.out.println("\nfirstname cannot be empty!!!\nEnter it again:");
        
       firstname = scanner.nextLine();
        
    }while(firstname.isEmpty());return firstname; 
        
    } else {
        
        System.out.println("\nfirstname captured");return firstname;}
}

public static String checkLastName(String lastname){
           Scanner scanner = new Scanner(System.in);
        
  System.out.println("\nEnter your lastname:");
   lastname = scanner.nextLine();
        
        
        if (lastname.isEmpty()) {
        
    do{System.out.println("\nlastname cannot be empty!!!\nEnter it again:");
        
       lastname = scanner.nextLine();
        
    }while(lastname.isEmpty());return lastname; 
        
    } else {
        
        System.out.println("\nlastname captured");return lastname;}
}

//Username format check

public static boolean checkUsername(String username){
       
  if (username.length() == 5 &&
      username.contains("_") &&
      username.matches(".*[a-z]*.") ) {
        
        return true; 
    } else {
        
        return false;
    }
 }       
 
//Basic regular expression for the cellphone nuumber - coded by Meta AI - simpilfied by me for ease of use 

public static boolean checkCellnumber(String cellnumber){
 
 if (cellnumber.matches("^\\+27\\d{10}$") ) {
        
        return true; 
    } else {
        
        return false;
    }
}

//Password format check
public static boolean checkPassword(String password){

if (password.length() == 8 &&
    password.matches(".*[A-Z]*.") &&
    password.matches(".*[~!@#$%^&*()_+=-`?><,./';:]*.") &&
    password.matches(".*[0-9]*.")) {
        
        return true; 
    } else {
        
        return false;
    }
}

//Overloaded method for registering the username

public static String registerUser(String username){
if(!checkUsername(username)){System.out.println("\nIncorret username format: ensure it is 5 characters and contains an underscore");}
else {System.out.println("\nUSERNAME SUCCESSFULLY CAPTURED");}return username;
    
}

//Overloaded method for registering the cellphone number

public static String registerUser(String cellnumber,String username){
if(!checkCellnumber(cellnumber)){System.out.println("\nIncorrect cellphone number format: ensure it contains national code and is 10 digits");}
else {System.out.println("\nCELLPHONE NUMBER SUCCESSFULLY CAPTURED");}return cellnumber;

}

//Overloaded method for registering password

public static String registerUser(String password,String username,String cellnumber){
if(!checkPassword(password)){System.out.println("\nIncorrect password format: ensure it contains a capital letter,numbers,special characters and is 8 characters in length");}
else {System.out.println("PASSWORD SUCCESSFULLY CAPTURED");}return password;

}

//Overloaded method for confirmation of successfull registration or failed registration 

public static String registerUser(String username,String cellnumber,String password,String firstname,String lastname,boolean isRegistered){
if(checkPassword(password)&&checkCellnumber(cellnumber)&&checkUsername(username)){System.out.println("\nRegistration successfull");isRegistered = true;}
else{System.out.println("\nRegistration UNSUCESSFUL : please fix the errors");isRegistered = false;}  

return firstname;
}

//Method for logging in the user upon succesfull registration

public static boolean loginUser(String enteredUsername, String username, String password,String enteredPassword) {
    Scanner scanner = new Scanner(System.in);
    
System.out.println("\nEnter your Username to login");
enteredUsername = scanner.nextLine();

System.out.println("\nEnter your PASSWORD to login");
enteredPassword = scanner.nextLine();

    if (enteredPassword.equals(password)&&enteredUsername.equals(username)){System.out.println("\nUSERNAME and PASSWORD captured successfully");return true;
 
 }else{

    if(!enteredPassword.equals(password)||!enteredUsername.equals(username));System.out.println("\nWrong USERNAME or PASSWORD");return false;}
 }

//Method confirming successful or failed login along with greeting the user if the login is succesful 

public static String returnLoginStatus(String enteredUsername, String username, String password,String enteredPassword,String firstname,String lastname){

    if(!loginUser(enteredUsername,username,password,enteredPassword)){System.out.println("\nLogin unsucessful");
       
    } else {
        {System.out.println("\n<<<<<Login SUCCESSFULL: WELCOME BACK>>>>> "+firstname+" "+lastname+"\nIt is great to see you again!!!");}
       
       
    
    }

       return password;
    }
}
       
         
