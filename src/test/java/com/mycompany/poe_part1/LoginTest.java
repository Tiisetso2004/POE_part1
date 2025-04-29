/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe_part1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkFirstName method, of class Login.
     */
    @Test
    public void testCheckFirstName() {
        System.out.println("checkFirstName");
        String firstname = "";
        String expResult = "";
        String result = Login.checkFirstName(firstname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkLastName method, of class Login.
     */
    @Test
    public void testCheckLastName() {
        System.out.println("checkLastName");
        String lastname = "";
        String expResult = "";
        String result = Login.checkLastName(lastname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUsername method, of class Login.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("checkUsername");
        String username = "";
        boolean expResult = false;
        boolean result = Login.checkUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCellnumber method, of class Login.
     */
    @Test
    public void testCheckCellnumber() {
        System.out.println("checkCellnumber");
        String cellnumber = "";
        boolean expResult = false;
        boolean result = Login.checkCellnumber(cellnumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPassword method, of class Login.
     */
    @Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        String password ="";
        boolean expResult = false;
        boolean result = Login.checkPassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser_String() {
        System.out.println("registerUser");
        String username = "";
        String expResult = "";
        String result = Login.registerUser(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser_String_String() {
        System.out.println("registerUser");
        String cellnumber = "";
        String username = "";
        String expResult = "";
        String result = Login.registerUser(cellnumber, username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser_3args() {
        System.out.println("registerUser");
        String password = "";
        String username = "";
        String cellnumber = "";
        String expResult = "";
        String result = Login.registerUser(password, username, cellnumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser_6args() {
        System.out.println("registerUser");
        String username = "";
        String cellnumber = "";
        String password = "";
        String firstname = "";
        String lastname = "";
        boolean isRegistered = false;
        String expResult = "";
        String result = Login.registerUser(username, cellnumber, password, firstname, lastname, isRegistered);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String enteredUsername = "";
        String username = "";
        String password = "";
        String enteredPassword = "";
        boolean expResult = false;
        boolean result = Login.loginUser(enteredUsername, username, password, enteredPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String enteredUsername = "";
        String username = "";
        String password = "";
        String enteredPassword = "";
        String firstname = "";
        String lastname = "";
        String expResult = "";
        String result = Login.returnLoginStatus(enteredUsername, username, password, enteredPassword, firstname, lastname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
