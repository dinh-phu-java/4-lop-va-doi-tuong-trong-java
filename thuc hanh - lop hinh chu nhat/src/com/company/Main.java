package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập width");
        double width= in.nextDouble();
        System.out.println("Nhập hegiht");
        double height= in.nextDouble();

        Rectangle rectan= new Rectangle(width,height);
        System.out.println("your rectangle: "+rectan.display());
        System.out.println("Perimeter rectangle :"+rectan.getPerimeter());
        System.out.println("Area of rectangle "+rectan.getArea());
    }

}



