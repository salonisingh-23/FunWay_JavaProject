/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.funway;

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class printThread extends Thread{
    String st;
   
    public void run(){
         
        try{
            System.out.println("please wait bill is printing!!!");
            Thread.sleep(3000);
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    
    }
}
