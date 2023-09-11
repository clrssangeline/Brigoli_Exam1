/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Clarisse Angeline
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner scn = new Scanner(System.in);
        
        menu();
        int choice = scn.nextInt();
        if(choice==1){
            num1();
        }else if(choice==2){
        num2();
        }
        else if(choice==3){
        num3();
        }
        else if(choice==4)
        {
            num4();
                    }
        else if(choice==5){
         
        }else{
            System.out.println("Choice is invalid");
            menu();
        }
        
    }
        public static void menu(){
            System.out.println("What would you like to do? ");
            System.out.println("[1]");
            System.out.println("[2]");
            System.out.println("[3]");
            System.out.println("[4]");
            System.out.println("[5]");
        }
        static void num1 (){
            
        int [] num = {1,-2,3,-4,5};
            System.out.println("The positive integers in the array are: "+Arrays.toString(num));
            if(num[0]<0&&num[1]<0&&num[2]<0&&num[3]<0&&num[4]<0){
                System.out.println("0");
            }else 
            {int sum= (num[0])+(num[2]) + (num[4]);
                System.out.println("Sum of all positive integers is: "+ sum);
            }
        }
        static void num2(){
           String [] fruits = {"banana","apple","lanzones","durian","rambotan","kiwi","masanitas"};
           

      
    }
    public static void printArray(int arr[]){
        for (int num: arr){
            System.out.println(num+",");
        }
    }   
        public static void num3() {
            
    
        int []myArray ={1,2,3,4,5,6,7};
        int arrsize=myArray.length; 
            System.out.println(Arrays.toString(myArray));
            System.out.println("The length of the array is "+arrsize);
      
   
        
        }
        public static void num4(){
        int [] positiveEvenNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,20};
            System.out.println("The positive even numbers are:" );
        

        }
        }

        


    
