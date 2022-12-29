/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keshavd00253307projectsem1;

/**
 *
 * @author kesha
 */
//HANGMAN GAME ...............................
//FIRST LETTER OF TOWN IS CAPITAL REMEMBER TO PUT CAPITAL LETTER .
//U GOT 3 LIVES FOR EACH LETTER SO PLAY CAREFULLY .
import java.util.Scanner;
import java.util.Random;
import java.io.File; 
import java.io.IOException;
public class KeshavD00253307Q2 {
    public static void main(String[] args)throws IOException{
        Random r=new Random();
        File f=new File("TownsIreland.txt");
        Scanner s=new Scanner(f);
        Scanner sc=new Scanner(System.in);
          String n;
          while(s.hasNext()){
              n=s.nextLine();
              int i=0;
              int e =r.nextInt(1,10);
              int d=r.nextInt(1,10); 
              int p=n.indexOf("\t");
              if(e==d){
                  System.out.println(n);
                  
                  System.out.println();
                  System.out.print("Hint are county name and pop :");
                  while(p<n.length()){
                      char t=n.charAt(p);
                      System.out.print(t);
                       p++;
                 }
                 System.out.println();
                 int j=0;
                 while(j<p-1){
                     char w=n.charAt(j);
                     if(w=='\t'){ 
                        break; 
                     }
                     System.out.print("X");
                     j++;
                 }
                 System.out.println();
                 int g=0;
                 int lives=3;
                 char guess;
                 while(g<n.indexOf('\t')){
                     System.out.println("enter the charcter: ");
                     guess=sc.next().charAt(0);
                     if(guess==n.charAt(g)){
                         System.out.println(guess+" well done u have 3 lives left");
                         g++;
                     }
                     else{
                         System.out.println("u loose one life");
                         lives--;
                     }
                     if(lives<=0){
                         System.out.println("game over ");
                         break;
                     }
                     
                 }
                 break;
              }
             
              
          } 
   
    }
          
}
