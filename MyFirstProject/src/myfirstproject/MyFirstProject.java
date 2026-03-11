/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstproject;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Сергей
 */
public class MyFirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       System.out.println(calculate(2.4,4.5,"k"));

    }
 public static double calculate(double a, double b, String op) {
   
    String message="IllegalArgumentException";
    return op=="+"?a+b:op=="*"?a*b:op=="-"?a-b:op=="/"?a/b:0;
  }
    
}
   




