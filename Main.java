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
            player = 0;
            player2 = 0;
            yes = 4;
            no = 5;


            rock = 1;
            paper = 2;
            scissors = 3;
            score = 1;



            final String[] verb = {"rock", "paper", "scissors"};
            Random random = new Random();
            int index = random.nextInt(verb.length);
            System.out.println(verb[index]);

            switch (score){

                case 1:
                    System.out.println(rock > scissors);
                    System.out.println("score:  Player: 0 Player2: "+ score );
                    System.out.println("You Win");
                    break;
                case 2:
                    System.out.println(scissors > paper);
                    System.out.println("score: "+ score );
                    System.out.println("You Win");
                    break;
                case 3:
                    System.out.println(paper > rock);
                    System.out.println("score: "+ score );
                    System.out.println("You Win");
                    break;
            }

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





    }

    /*public static int checkWords(Scanner keyboard){
        int words;
        words = 0;
        boolean wrongWords = true;
        while (wrongWords){

            System.out.println("");
        }
    }*/





