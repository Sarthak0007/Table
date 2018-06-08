/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table;

import java.util.Scanner;


public class Table {

    
    public static void main(String[] args) {
        
        int n;
        
       Scanner scn =new Scanner (System.in);
       System.out.println("Enter Table Number:");
        n =scn.nextInt();
         
        System.out.println("");
        for(int i =1; i<=10; i++)
        {
            System.out.println(n + "x" + i + "=" + ""+n*i);
        }
    }
    
}
