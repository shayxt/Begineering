/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seyi_
 */
import java.util.Scanner;
public class PrintAmericanTime {
    public static void printAmerican(int day, int month, int year){
        System.out.print(day);
        System.out.print("/");
        System.out.print(month);
        System.out.print("/");
        System.out.print(year);

    }
public static void main(String [] args){
            
           Scanner in = new Scanner(System.in);
           System.out.println("Please enter date, time and year:");
           System.out.println("Current Month:");
            //Short restricts to single digits, apparently
           short mnth = in.nextShort();
           System.out.println("Current Day:");
           short date =  in.nextShort();
           System.out.println("Current Year:");
           int yearCurrent = in.nextInt();
           
           System.out.print("The current American Day is: ");
           printAmerican(mnth, date, yearCurrent);
           

            


}

}
