/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcolibri.secure.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.ui.Model;

/**
 *
 * @author a119
 */
public class LoginControllerTest {
    
    public LoginControllerTest() {
    }
    
    @Test
    public void testLoginPage() {
        System.out.println("loginPage");
        Model model = null;
        LoginController instance = new LoginController();
        String expResult = "login";
        String result = instance.loginPage(model);
        assertEquals(expResult, result);
    }
    
}
