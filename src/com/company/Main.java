package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число x:");
        int x = in.nextInt();
        System.out.println("Введите число y:");
        int y = in.nextInt();

        Primer pr = new Primer(x, y);
        pr.primer();
    }
}
class Primer{
    private int x;
    private int y;

    Primer(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void primer(){
        if((y+1) != 0){
            double z = (double) (x+y)/(y+1);
            System.out.printf("(x+y)/(y+1) = %.3f %n", z);
        }else {
            System.out.println("На ноль делить нельзя!");
        }
    }
}