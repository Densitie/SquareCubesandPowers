/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubessquaresandpowers;
import java.util.Scanner;

/**
 *
 * @author ajayk
 */
public class CubesSquaresandPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable Declaration Area
        int option;
        int num;
        int num1;
        int power;
        
        
        Scanner user = new Scanner (System.in);
        
        System.out.println("-----------------Chose option--------------------"); 
        System.out.println("1. Find the value of a number squared (NOTE: 2^2 = 2 x 2");
        System.out.println("2. Find the value of a number cubed (NOTE: 2^3 = 2 x 2 x 2)");
        System.out.println("3. Find the value of a number, to any power.");
        System.out.println("4. Exit");
        System.out.println("-------------------------------------------------");
            
        option = user.nextInt();
        
        switch(option){
            case 1:
                System.out.println("-------------------------------------------------");
                System.out.println("Enter number you would like to square.");
                num = user.nextInt();
                System.out.println("-------------------------------------------------");
                num1 = num * num;
                while (num < num1){
                    num = num * num;
                    System.out.println("");
                    System.out.println("Total is " + num);
                }
                 
                System.out.println("-----------------Chose Menu--------------------"); 
                System.out.println("1. Find the value of a number squared (NOTE: 2^2 = 2 x 2");
                System.out.println("2. Find the value of a number cubed (NOTE: 2^3 = 2 x 2 x 2)");
                System.out.println("3. Find the value of a number, to any power.");
                System.out.println("4. Exit");
                System.out.println("-------------------------------------------------");
            
                option = user.nextInt();
                break;
           
            case 2:
                System.out.println("-------------------------------------------------");
                System.out.println("Enter number you would like to cube.");
                num = user.nextInt();
                num1 = num * num * num;
                while (num < num1){
                    num = num * num * num;
                    System.out.println("");
                    System.out.println("Total is " + num);
                }
                 
               System.out.println("-----------------Chose option--------------------"); 
               System.out.println("1. Find the value of a number squared (NOTE: 2^2 = 2 x 2");
               System.out.println("2. Find the value of a number cubed (NOTE: 2^3 = 2 x 2 x 2)");
               System.out.println("3. Find the value of a number, to any power.");
               System.out.println("4. Exit");
               System.out.println("-------------------------------------------------");
            
               option = user.nextInt(); 
                break;
                
            case 3:
                System.out.println("-------------------------------------------------");
                System.out.println("Enter number you would like to find to any power.");
                num = user.nextInt();
                System.out.println("Enter the power.");
                power = user.nextInt();
                System.out.println("-------------------------------------------------");
                num1 = num;
                for (int i=1;i<power;i++){
                    num = num1 * num;
                    System.out.println("");
                    System.out.println("Total is " + num);
                }       
                System.out.println("-----------------Chose option--------------------"); 
                System.out.println("1. Find the value of a number squared (NOTE: 2^2 = 2 x 2");
                System.out.println("2. Find the value of a number cubed (NOTE: 2^3 = 2 x 2 x 2)");
                System.out.println("3. Find the value of a number, to any power.");
                System.out.println("4. Exit");
                System.out.println("-------------------------------------------------");
            
                option = user.nextInt();
                
                
                break;
            
            case 4:
                break;
        }
   
    
    
    }
    
}
