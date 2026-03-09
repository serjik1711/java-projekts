/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstproject;

import java.util.Arrays;
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
     int []arr=new int[]{1, 2, 3, 4, 6, 7, 8};
     
       System.out.println(find(arr));

    }
 static Integer find(final int[] array) {
    
      for(int i=1;i<array.length;i++)
      {
          int raznica=Math.abs(array[i]-array[i-1]);
             if(raznica>1){
              return array[i];
             }
      }
        return null;
    }
    
}
   




