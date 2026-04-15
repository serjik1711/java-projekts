/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstproject;

//import java.math.BigDecimal;

import java.util.Arrays;
//import java.lang.Math;
//import java.math.MathContext;
import java.math.RoundingMode;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.List;
/**
 *
 * @author Сергей
 */
public class MyFirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println(finalGrade(52, 1));
                
    }
 
  
    public static int finalGrade(int exam, int projects){
       int result=0,result1=0,resOk=0;
       
      if(exam<50){result=0;}
        if(exam>50&&exam<76){result=75;}
          if(exam>75&&exam<91){result=90;}
             if(exam>90){result=100;}
              if(projects<2){result1=0;}
                 if(projects>1&&projects<5){result1=75;}
                    if(projects>4&&projects<11){result1=90;}
                       if(projects>10){result1=100;}
                         if(result1>0){resOk=result1;}else resOk=result;
             
            return resOk;
    }
       
    
   
} 




