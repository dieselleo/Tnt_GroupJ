/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tnt_groupj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

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
  
  
  
 static void Pedromethod() {
   //int are made to save informations
    int number1 ;
    int number2 ;
    //Scanner is the code to save int informations
    Scanner input = new Scanner(System.in);
    
    System.out.println("Type the first number");
    //It will save the first number
    number1 = input.nextInt();
    
    System.out.println("Type the second number");
    // It will save the second number
    number2= input.nextInt();
    
    System.out.println("The result of this multiply is:" + (number1*number2));
    //This is the code that makes the multiplication
   }
static void AsraltsMethod() {
        int age;
        Scanner input = new Scanner (System.in);
        System.out.println("How old are you?");
        age = input.nextInt();
            if (18<age) {
                System.out.println("Too young to enter the concert");
            }else{
                System.out.println("You may enter the concert");
            }
}
 
 static void Luanmethod(){
     int number1;
     int number2;
     int sum;
             
     Scanner input = new Scanner(System.in);
     
     System.out.println("Please type the first number");
     number1 = input.nextInt();
     
     System.out.println("Please type the second number");
     number2 = input.nextInt();
     
     sum = number1 + number2;
     System.out.println("The sum of your 2 numbers is " + sum);
    }

   static void Danimethod (){
   
           
        int num1, num2;
      
                
    Scanner myKB = new Scanner(System.in);
    
    System.out.println("Enter your First number");
      num1 = myKB.nextInt();
      
    System.out.println("Enter your Second number");
    num2 = myKB.nextInt();
    
      int sub = num1-num2;
      
    System.out.println("The Subtraction of your numbers is " + sub);
    
   }
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
