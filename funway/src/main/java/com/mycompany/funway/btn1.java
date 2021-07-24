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
public class btn1 {
    String name;
    String post;
    public btn1(){
        name=null;
        post=" ";
    }
    public btn1(String name,String post){
        this.name=name;
        this.post=post;
    }
    public String display(String name){
        return "Welcome "+name;
    }
    public String display(String name,String post){
        return "Welcome "+name +" ("+post+" )";
    }
}
