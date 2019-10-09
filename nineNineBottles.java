/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seyi_
 */
public class nineNineBottles {

    public static void CountBottlesDown(int iBottle) {
        int i;

        for (i = 99; i>=1; i--) {
            System.out.println(i + " bottles of beer on the wall. Take one down, throw it all around,");
               if (i == 1){
                System.out.println( i + " bottle of beer on the wall. Awaiting further instructions, Control.");
               }   
               
        }  
        
        }

    

    public static void main(String[] args) {
        CountBottlesDown(99);

    }

}