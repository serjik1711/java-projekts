/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstproject;

//import java.math.BigDecimal;

import java.util.Arrays;

//import java.math.MathContext;
//import java.math.RoundingMode;
//import java.util.Arrays;

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
        
        System.out.println(feast("adfd","afab"));
    } 
    public static boolean feast(String beast, String dish) {
       
       boolean start1=beast.startsWith("a");
       boolean finish1=beast.endsWith("b");
       boolean start2=dish.startsWith("a");
       boolean finish2=dish.endsWith("b");
       boolean rezF1=false;
       boolean rezF2=false;
       
       if(start1==start2){rezF1=true;}
          if(finish1==finish2){rezF2=true;}
             if(rezF1==rezF2){return true;}

    return false;
    
  }
    
}
   




