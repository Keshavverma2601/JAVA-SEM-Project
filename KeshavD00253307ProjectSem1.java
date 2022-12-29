/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keshavd00253307projectsem1;

/**
 *
 * @author kesha
 */
import java.util.Scanner;
import java.util.Random;
public class KeshavD00253307ProjectSem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r=new Random();
        Scanner s=new Scanner(System.in);
        String player1;
        int player1_score;
        System.out.println("enter the player1 name: ");
        player1=s.next();
        String player2="computer";
        int comp_score;
        int i=0,round,player1wins=0,compwins=0,matchdraws=0;
        System.out.println("Enter the no.of rounds you want to play: ");
        round=s.nextInt();
        while(i<round){
            player1_score=r.nextInt(1,7);
            System.out.println("player1 score: "+player1_score);
            comp_score=r.nextInt(1,7);
            System.out.println("comp score: "+comp_score);
            if(player1_score>comp_score){
                System.out.println("player1 wins:");
                player1wins++;
            }
            else if(player1_score==comp_score){
                System.out.println("match draws");
                matchdraws++;
            }
            else{
                System.out.println("comp wins");
                compwins++;
            }
            i++;
        }
        System.out.println();
        System.out.println("Match Statistics: ");
        System.out.println("Match played between computer and player are: "+round);
        System.out.println(player1+" wins:"+player1wins);
        System.out.println("computer wins: "+compwins);
        System.out.println("match draws: "+matchdraws);
        
    }
    
    
}
