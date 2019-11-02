/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author williamlaw
 */
import java.util.Scanner;

public class MathLibrary {
   public static void main (String [] args){
        
        //calcuate days in the future
        Scanner s = new Scanner(System.in);
        int inputDay;
        int futureDayInt;
        String futureDayInWeek = null;
        
        System.out.println("Happy Saturday! Give me a number and I will calculate what day in the future it will be");
            inputDay = s.nextInt();
            
            futureDayInt = inputDay % 7;
            
            switch(futureDayInt){
                case 1:
                    futureDayInWeek = "Sunday";
                    break;
                case 2:
                    futureDayInWeek = "Monday";
                    break;
                case 3:
                    futureDayInWeek = "Tuesday";
                    break;
                case 4:
                    futureDayInWeek = "Wednesday";
                    break;
                case 5:
                    futureDayInWeek = "Thursday";
                    break;
                case 6:
                    futureDayInWeek = "Friday";
                    break;
                case 0:
                    futureDayInWeek = "Saturday";
                    break;
                         
            }
            
        //calculate circumference
        
        Scanner c = new Scanner(System.in);
        double userInputDiameter = 0;
        double calculatedCircumference;
        double radius;
        System.out.println("Great! Now give me a number for your diameter and I will calculate the circumference of a circle.");
            userInputDiameter = c.nextInt();
    
        radius = userInputDiameter / 2;
        calculatedCircumference = 2 * Math.PI * radius;
        
        
        //money and interest rates
        Scanner m = new Scanner(System.in);
        double userPrinciple;
        double userTime;
        double userRate;
        double earnedInvestment;
        System.out.println("Now, I will calculate your earned Investment. Please give me your principle");
            userPrinciple = m.nextDouble();
        System.out.println("Give me a yearly interest rate % you would like to receive");
            userRate = m.nextDouble();
        System.out.println("Give a time you would like to invest it");
            userTime = m.nextDouble();
        earnedInvestment = (userPrinciple * Math.pow(Math.E, (userRate * userTime)));
        
        
        
             
        
        System.out.println(inputDay + " days from now is " + futureDayInWeek);
        System.out.println("Your circumference is " + calculatedCircumference);
        System.out.println("Your total investment is " + earnedInvestment);
    }
}

