/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bowlinggame;

import java.util.Random;

/**
 *
 * @author Erwin
 */
public class Game {

    private int tmp=0, scoreAllGame=0 , scoreMiniRound=0, miniRound=1,scoreMiniPoint1=0,scoreMiniPoint2=0;
    public int pin;
    
    // jest wywoływana dla każdego rzutu, przekazujemy ilość strąconych kręgli
    public void roll(int pins) {
        
        Random generate = new Random();
        scoreMiniPoint1 = generate.nextInt(pins);
        System.out.println("Liczba1:"+scoreMiniPoint1);
        strike(scoreMiniPoint1);
        scoreMiniPoint2 = generate.nextInt(pins);
        System.out.println("Liczba2:"+scoreMiniPoint2);
        scoreMiniRound=scoreMiniPoint1+scoreMiniPoint2;
        //System.out.println(scoreMiniRound);
        spare(scoreMiniRound);
        scoreAllGame = scoreAllGame + scoreMiniRound;
        
    
        if(miniRound < 2){
            miniRound++;
        }
        else{
            miniRound=1;
            scoreMiniRound=0;
        }
        
    }
    public void spare(int liczba){
        if(liczba==10 && miniRound==2){
            System.out.println("strike");
           roll(pin);
        }
    }
    public void strike(int liczba){
        if(liczba==10 && miniRound==1){
            System.out.println("strike");
           roll(pin);
        }
    }
    public void secondMove(){
        if(tmp!=10){
        
        }
        
    }
    // wywoływana na końcu po wszystkich rzutach, zwraca wynik gry.
    public int score() {
        return scoreAllGame;
    }
}
