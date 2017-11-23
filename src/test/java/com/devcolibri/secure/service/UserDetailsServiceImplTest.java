/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcolibri.secure.service;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsServiceImplTest {
    
    public UserDetailsServiceImplTest() {
    }
    
    @Test
    public void testLoadUserByUsername() {
        System.out.println("loadUserByUsername");
        String email = "";
        UserDetailsServiceImpl instance = new UserDetailsServiceImpl();
        UserDetails expResult = null;
        UserDetails result = instance.loadUserByUsername(email);
        assertEquals(expResult, result);
    }
    
}
