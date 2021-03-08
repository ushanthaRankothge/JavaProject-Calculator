
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ushanthaR
 */
import java.util.*;
public class MainJavaProjectTimeCal {

    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    Date date = new Date();
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    
    
    int totalTime ;
    System.out.println("Let's calculate length and date to complete your Agile Java Project");
    System.out.println("How long it will take you to finish the Planing process in min ? ");
    int planing = scan.nextInt();
    System.out.println("How long it will take you to finish the Requirnment Analysis process in min ? ");
    int requir = scan.nextInt();
    System.out.println("How long it will take you to finish the Design process in min ? ");
    int design = scan.nextInt();
    System.out.println("How long it will take you to finish the Development process in min ? ");
    int develop = scan.nextInt();
    System.out.println("How long it will take you to finish the Unit Testing process in min ? ");
    int unitTest = scan.nextInt();
    System.out.println("How long it will take you to finish the Deployment process in min ? ");
    int deployment = scan.nextInt();
    
    totalTime = planing + requir + design + develop + unitTest + deployment;
    int intHours = totalTime / 60;
            
    System.out.println("Total time " + totalTime + " sec to complete");
    System.out.println( intHours + " hours to Complete"); 
    System.out.println("Today is :"+ date);
    //date.setTime(totalTime);
    calendar.add(Calendar.HOUR_OF_DAY,intHours);
    
    System.out.println(calendar.getTime() + " is the date and time you can complete your Agile Java Project !");
    System.out.println("Calcuation done: Press 0 to exit the program ");
    int exit = scan.nextInt();
    if (exit == 0){
        System.exit(0);
        System.out.println("Good Bye");
    }
  
    }
}
