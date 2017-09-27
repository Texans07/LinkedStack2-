/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dougstack2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Doug
 */
public class DougStack2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // TODO code application logic here 
        //scanner to read user input
        Scanner scan = new Scanner(System.in);   
        /* Creating object of class linkedStack */   
        LnkList List = new LnkList(); 
       
        /* Perform Stack Operations */  
         
        int ch;
        int choice;
        int number;
        do 
        {
           // System.out.println("\nLinked Stack Operations");
            //System.out.println("1. Push");
            //System.out.println("2. Pop");
            //System.out.println("3. Top Of Stack");
            ////System.out.println("4. Check if Empty");
           // System.out.println("5. Size");            
           // int choice = scan.nextInt();
            String message = " 1.Push 2.Pop 3.Peek 4.Check Empty 5.Size" ;
           choice = Integer.parseInt(JOptionPane.showInputDialog(message));
            switch (choice) 
            {
            case 1 :
                //System.out.println("Enter integer element to push");
               number = Integer.parseInt(JOptionPane.showInputDialog("Enter integer to push"));
                List.push( number ); 
                break;                         
            case 2 : 
                try
                {
                    //System.out.println("Popped Element = "+ List.pop());
                    JOptionPane.showMessageDialog(null, "Popped Element = "+ List.pop());
                }
                catch (Exception e)
                {
                    //System.out.println("Error : " + e.getMessage());
                    JOptionPane.showMessageDialog(null, "Error : " + e.getMessage());
                }    
                break;                         
            case 3 : 
                try
                {
                    //System.out.println("Peek Element = "+ List.TopOfStack());
                    JOptionPane.showMessageDialog(null, "Top Of Stack = "+ List.TopOfStack());
                }
                catch (Exception e)
                {
                    //System.out.println("Error : " + e.getMessage());
                    JOptionPane.showMessageDialog(null, "Error : " + e.getMessage());
                }
                break;                         
            case 4 : 
                //System.out.println("Empty status = "+ List.isEmpty());
                JOptionPane.showMessageDialog(null, "Empty : " + List.isEmpty());
                break;                
            case 5 : 
               // System.out.println("Size = "+ List.getSize()); 
                JOptionPane.showMessageDialog(null, "Size: " + List.getSize());
                break;                                       
            default : 
                //System.out.println("Wrong Entry \n ");
                JOptionPane.showMessageDialog(null, "Incorrect Input"); 
                break;
            }           
            /* display stack */  
            //JOptionPane.showMessageDialog(null, "Size: " + List.ShowStack());
            List.ShowStack();            
            //System.out.println("\nDo you want to continue (Type y or n) \n");
           // ch = scan.next().charAt(0);       
            ch = JOptionPane.showConfirmDialog(null, "Would you like to quit", "Quit Stack?", JOptionPane.YES_NO_OPTION);
        } 
        while (ch == JOptionPane.NO_OPTION);                 
    }
    }
    

