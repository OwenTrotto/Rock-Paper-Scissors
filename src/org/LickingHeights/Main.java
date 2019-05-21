package org.LickingHeights;

import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here



        int score, round, yes, no, answer, rock, scissors, paper, player, player2;

        Scanner keyboard = new Scanner(System.in);
        boolean loop = true;
        while (loop){

            answer = checkAnswer(keyboard);
            round = checkRound(keyboard);
            score = checkScore(keyboard);

            final String[] verb = {"rock", "paper", "scissors"};
            Random random = new Random();
            int index = random.nextInt(verb.length);
            System.out.println(verb[index]);
        }
            player = 0;
            player2 = 0;
            yes = 4;
            no = 5;


            rock = 1;
        paper = 2;
        scissors = 3;
        score = 0;

        if (rock > scissors){
            System.out.println(" Rock beats Scissors, player gets one point ");
            System.out.println("score: "+ score ++);
        }
        if (rock > scissors){
            System.out.println("Rock beats Scissors, player2 gets one point");
            System.out.println("score: "+ score ++);
        }
        if(scissors > paper){
            System.out.println(" Scissors beats paper, Winner gets one point ");
            System.out.println("score: "+ score ++);
        }
        if(paper > rock){
            System.out.println(" Paper beats Rock, Winner gets one point");
            System.out.println("score: "+ score ++);
        }
        if(rock == rock){
            System.out.println(" No one gets a point ");
            System.out.println("score: "+ score ++);
        }
        if(scissors == scissors){
            System.out.println(" No one gets a point ");
            System.out.println("score: "+ score ++);
        }
        if(paper == paper){
            System.out.println(" No one gets a point ");
            System.out.println("score: "+ score ++);



        }



    }

    public static int checkAnswer(Scanner keyboard){
        int answer = 0;
        boolean wrongAnswer = true;
        while (wrongAnswer){

            System.out.println("To start game type Yes(4) or No(5)");
            answer = keyboard.nextInt();
            if (answer == 4 ){
                wrongAnswer = false;
            }
        }

        return answer;
    }

        public static int checkRound(Scanner keyboard){
            int round = 0;
            boolean wrongRound = true;
            while (wrongRound){

                System.out.println("Player: Rock(1), Paper(2), Scissors(3), Shoot");
                round = keyboard.nextInt();
                if (round == 0);
                    wrongRound = false;
            }
        return round;
    }

    public static int checkScore(Scanner keyboard){
        int score;
        score = 0;
        boolean wrongScore = true;
        while (wrongScore){

            System.out.println("Score: Player: 0 player2: "+ score++);
            score = keyboard.nextInt();
            if (score < 0);
            wrongScore = false;
        }
        return score;
    }

    /*public static int checkWords(Scanner keyboard){
        int words;
        words = 0;
        boolean wrongWords = true;
        while (wrongWords){

            System.out.println("");
        }
    }*/


}


