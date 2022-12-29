/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keshavd00253307projectsem1;

/**
 *
 * @author kesha
 */
//FANCY CRICKET(ODD/EVEN).............DESIGN BY KESHAV VERMA
//IT's a TWO PLAYER GAME.
import java.util.Scanner;
import java.util.Random;
public class KeshavD00253307Q3 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        String name;
        String computer_name="computer";
        System.out.println("name of the player ");
        name=s.next();
        int player_total=0;
        int computer_total=0;
        int batsmen=11;
        while(batsmen>0){
            int score_player;
            int score_comp;
            score_player=r.nextInt(1,11);
            score_comp=r.nextInt(1, 11);
            System.out.println();
            System.out.println("score_player: "+score_player+" - "+score_comp);
            computer_total=computer_total+score_comp;
            player_total=player_total+score_player;
            if(score_player-score_comp==-1||score_player-score_comp==1){
                System.out.println("batsman is out player_side ");
                batsmen--;
            }
            if(score_player==score_comp){
                player_total=player_total+(score_player*score_comp);
            }
        }
        System.out.println();
        System.out.println("PLAYER 1-"+name+"scores "+player_total);
        System.out.println();
        batsmen=11;
        while(batsmen>0){
            int score_player;
            int score_comp;
            score_player=r.nextInt(1, 11);
            score_comp=r.nextInt(1, 11);
            System.out.println();
            System.out.println("score_player: "+score_player+" - "+score_comp);
            computer_total=computer_total+score_comp;
            if(score_player-score_comp==-1 || score_player-score_comp==1){
                System.out.println("batsman is out comp_side ");
                batsmen--;
            }
            if(score_player==score_comp){
                computer_total=computer_total+(score_comp*score_player);
                
            }
        }
        System.out.println();
        System.out.println("computer-"+"scores "+computer_total);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        if(computer_total>player_total){
            System.out.println("COMPUTER's WINS ");
        }
        else if(computer_total==player_total){
            System.out.println("MATCH TIE ");
        }
        else{
            System.out.println("PLAYER 1-"+name+" wins");
        }
    }
}
