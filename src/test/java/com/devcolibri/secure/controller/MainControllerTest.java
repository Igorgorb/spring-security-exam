package com.devcolibri.secure.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.ui.Model;

public class MainControllerTest {
    
    public MainControllerTest() {
    }
    
    

    @Test
    public void testStart() {
        System.out.println("start");
        Model model = null;
        MainController instance = new MainController();
        String expResult = "index";
        String result = instance.start(model);
        assertEquals(expResult, result);
    }
    
}
