package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int score, rock = 0, paper = 0, scissors = 0, player;

        Scanner keyboard = new Scanner(System.in);
        boolean loop = true;
        while (loop){
            score = checkScore(keyboard);
            System.out.println(" To start game over type Yes or No ");







        }


        if (rock > scissors){
            System.out.println(" Winner gets one point ");
        }  else if(scissors > paper){
            System.out.println(" Winner gets one point ");
        }  else if(paper > rock){
            System.out.println(" Winner gets one point");
        }  else if(rock == rock){
            System.out.println(" No one gets a point ");
        }






    }






    public static int checkScore(Scanner keyboard){
        int score = 0;
        boolean wrongScore = true;
        while (wrongScore){

            System.out.println("The score is...");
            score = keyboard.nextInt();
            if (score > 0 && score < 4){
                wrongScore = false;
            }
        }
        return score;
    }




}
