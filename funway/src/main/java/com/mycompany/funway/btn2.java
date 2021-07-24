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
public class btn2 extends btn1{
    //this is the logout button
   
    String text="LOGIN AGAIN";
    public btn2(){
        super();
        this.text=text;
    }
    public btn2(String name,String post,String text){
        super(name,post);
        this.text=text;
    }
    
    public String display(String name,String post,String text){
        return name+"( "+post+" )"+ "logged out ! "+text;
    }
}
