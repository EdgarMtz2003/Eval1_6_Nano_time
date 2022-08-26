/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class Eval1_6_Nano_time {
    public static void main(String[]args){
        
        long ini = System.nanoTime();
        System.out.println(ini);
        long fin=System.nanoTime();
        long tiempo=fin-ini;
        System.out.println(tiempo);
        
    }
    
}
