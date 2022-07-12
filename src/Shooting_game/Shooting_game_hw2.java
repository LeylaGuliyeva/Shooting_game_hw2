package Shooting_game;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Shooting_game_hw2 {
    static void fill_square_array(char Array[][],int size,char def){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                Array[i][j]=def;}}}
    static void show_board(char Array[][]){
        System.out.println();
        for(int i=0;i<6;i++){
            System.out.print(i+"|");
        }
        System.out.println();
        for(int j=1;j<6;j++){
            System.out.print(j+"|");
            for(int k=0;k<5;k++){
                System.out.print(Array[j-1][k]+"|");}
            System.out.println();}
        System.out.println();}


    public static void main(String[] arg){
        while(true){
            System.out.println("All set. Get ready to rumble!");
            char board[][];
            board=new char[5][5];
            fill_square_array(board,5,'-');
            Random rnd1=new Random();
            int row=rnd1.nextInt(5);
            int column=rnd1.nextInt(5);
            int guess_row;
            int guess_column;
            while(true) {
                System.out.print("Please enter line number : ");
                int temp;
                while (true) {
                    Scanner sn1=new Scanner(System.in);
                    if (sn1.hasNextInt()){
                        temp=sn1.nextInt();
                        if(temp >= 1 && temp <= 5) {
                            guess_row = temp;
                            break;}
                        else {
                            System.out.print("Please enter a valid number (1-5) for line : ");
                        }
                    }
                    else {
                        System.out.print("Please enter a valid number (1-5) for line : ");
                    }
                }
                System.out.print("Please enter shooting bar : ");
                while (true) {
                    Scanner sn2=new Scanner(System.in);
                    if (sn2.hasNextInt()) {
                        temp=sn2.nextInt();
                        if (temp >= 1 && temp <= 5) {
                            guess_column = temp;
                            break;
                        }
                        else {
                            System.out.print("Please enter a valid number (1-5) for a shooting bar : ");}
                    } else {
                        System.out.print("Please enter a valid number (1-5) for a shooting bar : ");
                    }
                }
                if ((guess_column-1)== column && (guess_row-1)== row) {
                    System.out.println("You have won!");
                    board[row][column] = 'x';
                    show_board(board);
                    break;
                } else {
                    board[guess_row-1][guess_column-1] = '*';
                    show_board(board);
                }
            }
            System.out.println("\n");}}}
