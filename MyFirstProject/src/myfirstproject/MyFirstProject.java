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
        int[]mas=new int[]{1,2,4,6,8};
         int[]mas1=new int[]{3,6,6,1,8};
       System.out.println(Arrays.toString(mergeArrays(mas,mas1)));


  }
    public static int[] mergeArrays(int[] first, int[] second) {
		 int sizeOveral=first.length+second.length;
        int []arr2=new int [sizeOveral];
        int a=0,k=0;
           for(int i=0;i<first.length;i++){             //объединение
               arr2[i]=first[i];
               arr2[i+second.length]=second[i];
            System.out.println(first[i]+"\t"+second[i]);
           }
            for(int i=0;i<arr2.length-1;i++){           //сортировка
                for(int j=0;j<arr2.length-1;j++){
                    if(arr2[j]>arr2[j+1]){
                        a=arr2[j];
                        arr2[j]=arr2[j+1];
                        arr2[j+1]=a;
                    }
                } 
           }
            for(int i=0;i<arr2.length;i++){
                boolean p=false;
                for(int j=0;j<i;j++){
                    if(arr2[i]==arr2[j]){
                       p=true;
                       break;
                    }
                }
                if(!p){k++;}
           }
            int []arr3=new int[k];
            
             for(int i=0;i<arr2.length;i++){
                boolean p=false;
                for(int j=0;j<i;j++){
                    if(arr2[i]==arr2[j]){
                       
                    }
                }
                if(!p){k++;}
           }
           
             
           
                
                
           
            
            
           System.out.println(k);
		return arr2;
	}
    
    
}
   




