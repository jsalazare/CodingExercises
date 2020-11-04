package com.javier.knightMinimunMoves;

public class knightMinimunMoves {

    public static void main(String[] args) {

        System.out.println(minimumMoves2(3,4));
    }

    public static int minimumMoves(int x , int y ) {

        int axisX = Math.abs(x);
        int axisY = Math.abs(y);
        int temp;

        if (axisX < axisY) {
            temp = axisX;
            axisX = axisY;
            axisY = temp;
        }

        if(axisX==1 && axisY == 0){
            return 3;
        }
        if(axisX == 2 && axisY == 2){
            return 4;
        }

        int delta = axisX - axisY;
        if(axisY > delta){
            return delta - 2 * (delta - axisY)/3;
        }
        else{
            return delta - 2 * (delta - axisY)/4;
        }
    }

    public static int minimumMoves2(int x, int y){
        // axes symmetry
        x = Math.abs(x);
        y = Math.abs(y);
        int temp;
        // diagonal symmetry
        if (x < y) {
            temp = x;
            x = y;
            y = temp;
        }
        // 2 corner cases
        if(x==1 && y == 0){
            return 3;
        }
        if(x==2 && y == 2){
            return 4;
        }

        // main formula
        int delta = x-y;
        if(y>delta){
            return delta - 2 * (delta-y)/3;
        }
        else{
            return delta - 2 * (delta-y)/4;
        }
    }

}

