package com.bridgelabz;

public class SnakeLadder {
      static int  start = 0;
      static int end = 100;

    public static void main(String[] args) {
        int position = 0;
        int dieRole=0;
        while( position != end) {
            dieRole++;
            int dieNumber = (int) (Math.random() * 10) % 6 + 1;
            System.out.println("DieNumber:" +dieNumber);
            int option = (int) (Math.random() * 10) % 3;
            switch (option) {
                case 0:
                    System.out.println("No Play");
                    position += 0;
                    break;
                case 1:
                    System.out.println("Ladder");
                    position += dieNumber;
                    break;
                case 2:
                    System.out.println("Snake");
                    position -= dieNumber;
                    break;
            }

            if (position == 100) {
                break;
            }else if(position>100){
            position -= dieNumber;
            System.out.println("Staying in same position");
            }else if (position < 0) {
                position = start;
                System.out.println("Go to Start");
            }else{
                System.out.println("New Position : " +position);
            }
        }
        System.out.println("You are Winner, Position is : " +position);
    }
}
