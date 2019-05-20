package org.LickingHeights;

import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here



        int score, round, answer, rock = 0, paper = 0, scissors = 0, player = 0, player2 = 0;

        Scanner keyboard = new Scanner(System.in);
        boolean loop = true;
        while (loop){
            answer = checkAnswer(keyboard);
            round = checkRound(keyboard);
            player2 = 2;
            System.out.println(answer);
            System.out.println(player);
            System.out.println(player2);

            final String[] verb = {"rock", "paper", "scissors"};
            Random random = new Random();
            int index = random.nextInt(verb.length);
            System.out.println(verb[index]);
        }


        if (rock > scissors){
            System.out.println(" Rock beats Scissors, Winner gets one point");
        }  else if(scissors > paper){
            System.out.println(" Scissors beats paper, Winner gets one point ");
        }  else if(paper > rock){
            System.out.println(" Paper beats Rock, Winner gets one point");
        }  else if(rock == rock){
            System.out.println(" No one gets a point ");
        }  else if(scissors == scissors){
            System.out.println(" No one gets a point ");
        }  else if(paper == paper){
            System.out.println(" No one gets a point ");
        }
        if (player > player2){
            System.out.println("Score: 1-0");
        }   else if (player2 > player){
            System.out.println("Score: 0-1");
        }


    }

    public static int checkAnswer(Scanner keyboard){
        int answer = 0;
        boolean wrongAnswer = true;
        while (wrongAnswer){

            System.out.println("To start game type Yes or No");
            answer = keyboard.nextInt();
            if (answer == 1 ){
                wrongAnswer = false;
            }
        }
        return answer;
    }

        public static int checkRound(Scanner keyboard){
            int round = 0;
            boolean wrongRound = true;
            while (wrongRound){

                System.out.println("Rock, Paper, Scissors, Shoot");
                round = keyboard.nextInt();
                if (round == 0);
                    wrongRound = false;
            }
        return round;
    }



}

