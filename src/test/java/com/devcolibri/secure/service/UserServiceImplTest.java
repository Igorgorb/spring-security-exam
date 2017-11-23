/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcolibri.secure.service;

import com.devcolibri.secure.entity.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a119
 */
public class UserServiceImplTest {
    
    public UserServiceImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUser method, of class UserServiceImpl.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        String login = "";
        UserServiceImpl instance = new UserServiceImpl();
        User expResult = null;
        User result = instance.getUser(login);
        assertEquals(expResult, result);
    }
    
}
