/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnt_groupj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author diese
 */

public class Tnt_GroupJ {

    /**
     * @param args the command line arguments
     */
    static String getString (){
        /*
        * Author: Leonardo Diesel
        */
        String a="";
        boolean t=false;
        while (t==false){
            try{            
                BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
                a=myReader.readLine();
                if ((!a.matches("^-?\\d*\\.{0,1}\\d+$")) && (a.length()>1)){
                    t=true;
                } else {
                System.out.println("You did not insert a text");
                }
            } catch (Exception e){  
                System.out.println("Error");
            } 
        }
        return a;
    }
    static double getNumber (){
        /*
        * Author: Leonardo Diesel
        */
        double a=0.0;
        while (a==0.0){
            try{            
                BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
                a=Double.parseDouble(myReader.readLine());
            } catch (Exception e){   
                System.out.println("You did not insert a number!");
            }
        }
        return a;
    }    
    
    /*
    * Test Pedro
    */
      
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        * The code below is to explaining how the method works, 
        * latter it will be replaced for the real use of the methods
        */
        System.out.println("Insert your name!");
        System.out.println("Your name is "+ getString());
        System.out.println("Insert a number!");
        System.out.println("Your number is "+ getNumber());
    }
}
