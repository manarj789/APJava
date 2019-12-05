/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerleague;

import java.util.Random;

/**
 *
 * @author msingh893
 */
public class SoccerLeague {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random(); 
        int rand1 = rand.nextInt(33);
        int rand2 = rand.nextInt(33);
        int rand3 = rand.nextInt(33);
        
        if ((rand1<=32)&&(rand2<=32)&&(rand3<=32)){
            System.out.println("Season is cancelled, winter is here.");
        }
    }
    
}
