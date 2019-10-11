/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seyi_
 */
public class printRowExercise {
    public static void printRow(int n){         
    int i = 1;
    String s = "*";
    while (i <=n){
    System.out.printf("%s", s);
     i++;
     
    
    }
    
    System.out.println();
    }
        public static void printStar(){
    int k = 1;
    while (k<=10){
    printRow(k);
   k++;
    }
    }
    public static void main(String[]args){
    printStar();
    }
}
