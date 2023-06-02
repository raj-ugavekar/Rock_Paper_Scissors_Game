/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissorsgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author RAJ
 */
public class RockPaperScissorsGame {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int c = 0;
        int your_points = 0;
        int opponents_points = 0;
        while (c != 3) {
            System.out.println("-------------------------------------------------");
            System.out.println("\tROCK PAPER AND SCISSORS GAME\t");
            System.out.println("-------------------------------------------------");
            System.out.println("Enter your Choice:\n0.Rock\n1.Paper\n2.Scissors");
            int choice = s.nextInt();
            System.out.println("Your choice is :" + choice);
            Random random = new Random();
            int x = random.nextInt(2);
            System.out.println("Opponents choice is :" + x);
            if (choice == 0 && x == 1 || (choice == 1 && x == 2) || (choice == 2 && x == 0)) {
                System.out.println("\nOpponent is the winner! Please Try Again!!!");
                opponents_points++;
                System.out.println("\nYour Points are :" + your_points);
                System.out.println("Opponents Points are :" + opponents_points);
            } else if (choice == 0 && x == 2 || (choice == 1 && x == 0) || (choice == 2 && x == 1)) {
                System.out.println("Congratulations!!! Your are the winner!");
                your_points++;
                System.out.println("\nYour Points are :" + your_points);
                System.out.println("Opponents Points are :" + opponents_points);
            } else if ((choice == 0 && x == 0) || (choice == 1 && x == 1) || (choice == 2 && x == 2)) {
                System.out.println("It's a Tie!!!");
                System.out.println("\nYour Points are :" + your_points);
                System.out.println("Opponents Points are :" + opponents_points);
            } else {
                System.out.println("You have entered an Invalid Choice!!!Please Try Again!!!!");
                c--;
            }
            System.out.println("-------------------------------------------------");
            c++;
        }
        System.out.println("\nYour Total Points are :" + your_points);
        System.out.println("\nOpponents Total Points are :" + opponents_points);
        if (your_points > opponents_points) {
            System.out.println("\nCongratulations!!! Your are the ultimate winner!!!\n");
        } else if (opponents_points > your_points) {
            System.out.println("\nOpponent is the ultimate winner!!!\nBetter luck next time!!! ");
        } else {
            System.out.println("\nIt's an ultimate Tie!!!");
        }
    }
}
