package com.rehan.Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("I have randomly chosen a number between 1-100\nTry to guess it");
        int randomNumber = (int)(Math.random()*100);
        boolean win = false;
        for(int i=10;i>0;i--){
            System.out.println("You have to "+i+" guess left");
            int number = input.nextInt();
            if (number<randomNumber){
                System.out.println("Its bigger than "+number);
            }
            else if(number>randomNumber){
                System.out.println("Its smaller than "+number);
            }
            else {
               win = true;
               break;
            }
        }
        if(win){
            System.out.println("CORRECT..You Win!!");
        }
        else {
            System.out.println("Sorry you lose!");
        }
    }
}
