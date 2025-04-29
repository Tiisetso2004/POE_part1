/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe_part1;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

public class POE_part1Test {

    // --- Tests for Validation Methods Without Interactive Input ---

    @Test
    public void testCheckUsername_Success() {
        // A valid username: 5 characters, contains underscore, contains lower-case letter(s)
        String validUsername = "ab_cd";
        assertTrue(Login.checkUsername(validUsername));
    }
    
    @Test
    public void testCheckUsername_Failure() {
        // Fail because no underscore, or wrong length
        String invalidUsername = "abcde";
        assertFalse(Login.checkUsername(invalidUsername));
    }
    
    @Test
    public void testCheckCellnumber_Success() {
        // A valid cell number must begin with +27 and be followed by exactly 10 digits.
        // For instance: +271234567890
        String validCellnumber = "+271234567890";
        assertTrue(Login.checkCellnumber(validCellnumber));
    }
    
    @Test
    public void testCheckCellnumber_Failure() {
        String invalidCellnumber = "0123456789";
        assertFalse(Login.checkCellnumber(invalidCellnumber));
    }
    
    @Test
    public void testCheckPassword_Success() {
        // Password conditions: exactly 8 characters; contains at least one uppercase letter,
        // one special character from the set [~!@#$%^&*()_+=-`?><,./';:] and one digit.
        // Using "A1@bcdef" (8 characters) as a test string.
        String validPassword = "A1@bcdef";
        assertTrue(Login.checkPassword(validPassword));
    }
    
    @Test
    public void testCheckPassword_Failure() {
        // 7-character string should fail.
        String invalidPassword = "A1@bcde";  
        assertFalse(Login.checkPassword(invalidPassword));
    }
    
    // --- Tests for Overloaded registerUser Methods (non-interactive) ---

    @Test
    public void testRegisterUserUsername() {
        String validUsername = "ab_cd";
        // Method prints a message then returns the same username.
        String returnedUsername = Login.registerUser(validUsername);
        assertEquals(validUsername, returnedUsername);
    }
    
    @Test
    public void testRegisterUserCellnumber() {
        String validCellnumber = "+271234567890";
        String returnedCellnumber = Login.registerUser(validCellnumber, "ab_cd");
        assertEquals(validCellnumber, returnedCellnumber);
    }
    
    @Test
    public void testRegisterUserPassword() {
        String validPassword = "A1@bcdef";
        String returnedPassword = Login.registerUser(validPassword, "ab_cd", "+271234567890");
        assertEquals(validPassword, returnedPassword);
    }
    
    @Test
    public void testRegisterUserAll_Success() {
        String username = "ab_cd";
        String cellnumber = "+271234567890";
        String password = "A1@bcdef";
        String firstname = "John";
        String lastname = "Doe";
        boolean isRegistered = false;
        // This method prints a message and returns the firstname.
        String returnedFirstName = Login.registerUser(username, cellnumber, password, firstname, lastname, isRegistered);
        assertEquals(firstname, returnedFirstName);
    }
    
    // --- Tests for Methods that Read from the Console (Interactive Methods) ---
    // We simulate user input by redirecting System.in.

    @Test
    public void testCheckFirstName_NotEmpty() {
        // Simulate input of "Alice" (plus line separator)
        String simulatedInput = "Alice\n";
        InputStream originalIn = System.in;
        try {
            System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
            // Call method; it prompts but then reads our simulated input.
            String name = Login.checkFirstName("");
            assertEquals("Alice", name);
        } finally {
            System.setIn(originalIn);
        }
    }
    
    @Test
    public void testCheckLastName_NotEmpty() {
        // Simulate input of "Smith"
        String simulatedInput = "Smith\n";
        InputStream originalIn = System.in;
        try {
            System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
            String name = Login.checkLastName("");
            assertEquals("Smith", name);
        } finally {
            System.setIn(originalIn);
        }
    }
    
    @Test
    public void testLoginUser_Success() {
        // Prepare simulated input:
        // First line: username ("ab_cd")
        // Second line: password ("A1@bcdef")
        String simulatedInput = "ab_cd\nA1@bcdef\n";
        InputStream originalIn = System.in;
        try {
            System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
            // Pass empty strings for enteredUsername/Password; they will be overwritten by scanner input
            boolean result = Login.loginUser("", "ab_cd", "A1@bcdef", "");
            assertTrue(result);
        } finally {
            System.setIn(originalIn);
        }       
    }
    
    @Test
    public void testLoginUser_Failure() {
        // Simulate wrong credentials
        String simulatedInput = "wrongUser\nwrongPass\n";
        InputStream originalIn = System.in;
        try {
            System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
            boolean result = Login.loginUser("", "ab_cd", "A1@bcdef", "");
            assertFalse(result);
        } finally {
            System.setIn(originalIn);
        }
    }
    
    @Test
    public void testReturnLoginStatus_Success() {
        // Simulate correct credentials for loginUser (used internally by returnLoginStatus)
        String simulatedInput = "ab_cd\nA1@bcdef\n";
        InputStream originalIn = System.in;
        try {
            System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
            // returnLoginStatus prints a message and returns the password
            String returned = Login.returnLoginStatus("", "ab_cd", "A1@bcdef", "", "John", "Doe");
            // We expect the method returns the provided password ("A1@bcdef")
            assertEquals("A1@bcdef", returned);
        } finally {
            System.setIn(originalIn);
        }
    }
    
    @Test
    public void testReturnLoginStatus_Failure() {
        // Simulate wrong credentials
        String simulatedInput = "wrongUser\nwrongPass\n";
        InputStream originalIn = System.in;
        try {
            System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
            String returned = Login.returnLoginStatus("", "ab_cd", "A1@bcdef", "", "John", "Doe");
            // Regardless of login failure, the method returns the provided password.
            // We are verifying that the method's output remains consistent.
            assertEquals("A1@bcdef", returned);
        } finally {
            System.setIn(originalIn);
        }
    }
}

