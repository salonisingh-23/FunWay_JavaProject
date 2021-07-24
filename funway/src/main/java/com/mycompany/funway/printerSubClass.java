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
import details.*;
class p extends printer{
    public String show(){
        return "Thank You !! Visit again!!";
    }
}


class ending implements end{
    public String thankyou(){
        return "created by Saloni Singh";
    }
}

class imported{
    detail d=new detail();
    String info=d.usn();
}
public class printerSubClass {
    public static void main(String[] args) throws InterruptedException{
        printThread t=new printThread();
        t.start();
        t.join();
        System.out.println("Bill is printed");
        p p1=new p();
        p1.show();
        
    }
}

 
