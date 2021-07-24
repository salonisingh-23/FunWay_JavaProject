/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.funway;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class superClass {
    public double Chess;
    public double Bowling;
    public double NFS;
    public double Dragon;
    
    public double Carting;
    public double Skating;
    public double Shooting;
    public double Swimming;
    
    public double costIndoor;
    public double costOutdoor;
    public double subTotal;
    
    public double Tax;
    public double Total;
    
    public double costOfIndoor(){
        costIndoor=Chess+Bowling+NFS+Dragon;
        return costIndoor;
    }
    public double costOfOutdoor(){
     costOutdoor= Carting+Shooting+Skating+Swimming;
     return costOutdoor;
    }
    
    public double getAmount(){
        costIndoor=Chess+Bowling+NFS+Dragon;
        costOutdoor= Carting+Shooting+Skating+Swimming;
        subTotal=costIndoor+costOutdoor;
        return subTotal;
    }
    
    public double getTax(){
        costIndoor=Chess+Bowling+NFS+Dragon;
        costOutdoor= Carting+Shooting+Skating+Swimming;
        subTotal=costIndoor+costOutdoor;
        Tax=0.05*subTotal;
        return Tax;
    }
    public double finalAmount(){
         costIndoor=Chess+Bowling+NFS+Dragon;
        costOutdoor= Carting+Shooting+Skating+Swimming;
        subTotal=costIndoor+costOutdoor;
        Tax=0.05*subTotal;
        Total=subTotal+Tax;
        return Total;
    }
    private JFrame frame;
    public void iExitSystem(){
        frame=new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Funway",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
    
    
//      public double pChess=20;
//    public double pBowling=100;
//    public double pNFS=100;
//    public double pDragon=200;
//    
//    public double pCarting=200;
//    public double pSkating=200;
//    public double pShooting=150;
//    public double pSwimming=150;
//    
//    public double pTax=15;
    
    
    
}
