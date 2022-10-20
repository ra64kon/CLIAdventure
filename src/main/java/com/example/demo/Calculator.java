package com.example.demo;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class Calculator {
    
    @ShellMethod(value = "Add two integers together.", group = "Rechner")
    public int add(int left, int right) {
        return left + right;
    }

    @ShellMethod(value = "Subtracts on integer from another.", group = "Rechner")
    public int subtract(int left, int right) {
        return left - right;
    }

    @ShellMethod(value = "This method will do nothing", group = "Rechner")
    public String go() {
        return ("This method goes as expected.\n next line"); 
        //return "myFail";
    }
    
    

}
