package com.bridgelabz;

public class SnakeLadder {
    public static void main(String[] args) {
        int position =0;
        int dieNumber = (int)(Math.random()*10)%6+1;
        System.out.println("DieNumber:" +dieNumber);
        int option = (int)(Math.random()*10)%3;
        switch(option){
            case 1:
                System.out.println("No Play");
                position +=0;
                break;
            case 2:
                System.out.println("Ladder");
                position += dieNumber;
                break;
            case 3:
                System.out.println("Snake");
                position -= dieNumber;
                break;

        }
        System.out.println(option);
        }
    }

