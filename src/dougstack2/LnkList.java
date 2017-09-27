/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dougstack2;

import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

/**
 *
 * @author Doug
 */
public class LnkList {
     private Node Top;
    private int size;
    
 // making function for stack
    public LnkList() 
    {
        Top = null;
        size = 0;
    }
    
 // making a function to see if stack is empty
    public boolean isEmpty()
    {
        return Top == null;
    }
    
 //  making a funtion to see how big the stack is
    public int getSize()
    {
        return size;
    }
    
 // making push function
    public void push(int data)
    {
       Node pointer = new Node (data,null);
       
       if (Top == null)
        {
           Top = pointer;        
        }
       else
       {
           pointer.setLink(Top);
           Top = pointer;
       }
       size++;
    }
    
 // making pop function
    public int pop()
    {
        if(isEmpty())
            throw new NoSuchElementException("Stack Is Empty Bruh!") ;
        Node ptr = Top;
        Top = ptr.getLink();
        size-- ;
        return ptr.getData();
    }
    
    //make function to display thesize of the stack
   /*public void ShowStack()
    {
        System.out.print("\nStack = ");
        if (size == 0) 
        {
            System.out.print("Stack Is Empty Bruh!\n");
            return ;
        }
        Node ptr = Top;
        while (ptr != null)
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getLink();
        }
        System.out.println();
   
    }*/
    public void ShowStack()
    {
        
        //JOptionPane.showMessageDialog(null,"Stack = ");
        if (size == 0) 
        {
            //JOptionPane.showInputDialog("Stack Is Empty");
            JOptionPane.showMessageDialog(null,"Stack Is Empty ");
        }
        Node ptr = Top;
        while (ptr != null)
        {
            
            
            JOptionPane.showMessageDialog(null,ptr.getData()+" ");
            
            ptr = ptr.getLink();
            
        }
        System.out.println(); 
        
    }
    
    
    // checking to see what is the top element in the stack
    public int TopOfStack()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Stack Is Empty Bruh!") ;
        return Top.getData();
    }    
}
