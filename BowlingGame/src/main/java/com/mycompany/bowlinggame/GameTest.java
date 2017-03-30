/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bowlinggame;

/**
 *
 * @author Erwin
 */
public class GameTest {

    public static void main(String[] args) {
        Game game = new Game();
// 20 rzutów po 0 punktów
        for (int i = 0; i < 100; i++) {
            game.pin=10;
            game.roll(game.pin);
        }
// Wynik powinien być 0
        System.out.print("Score: " + game.score());
    }
}