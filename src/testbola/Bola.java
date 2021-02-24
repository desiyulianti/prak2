/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbola;

/**
 *
 * @author MOKLET-2
 */
public class Bola {
    private double jarijari;
    public Bola(double jarijari){
     this.jarijari = jarijari;
    }
    public void setjarijari(double jarijari){
      this.jarijari = jarijari;   
    }
    public void showdiameter(){
    System.out.println("Diameter = "+ 2 * jarijari);
    }
    public void showluaspermukaan(){
    System.out.println("Luas Permukaan bola = "+(4/3*Math.PI*Math.pow(jarijari, 3)));
    }
    public void showvolume(){
     System.out.println("Volume bola = "+(4*Math.PI*Math.pow(jarijari, 2))); 
    }
}
