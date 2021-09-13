package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String length, width;
        boolean check=true;
        double len=0.0, wid=0.0;
        double constant=0.09290304, area=0.0;
        do{
            System.out.print("What is the length of the room in feet? ");
            length=sc.nextLine();
            try{
                len = Double.parseDouble(length);
                check=true;
            }catch (NumberFormatException ex) {
                System.out.println("You have to enter a numeric value!");
                check=false;
            }
        }while(check==false);

        do{
            System.out.print("What is the width of the room in feet? ");
            width=sc.nextLine();
            try{
                wid = Double.parseDouble(width);
                check=true;
            }catch (NumberFormatException ex) {
                System.out.println("You have to enter a numeric value!");
                check=false;
            }
        }while(check==false);

        System.out.printf("You entered dimensions of %.2f feet by %.2f feet.\n", len, wid);
        System.out.println("The area is ");
        area=wid*len;
        System.out.printf("%.2f square feet\n", area);
        area=area*constant;
        System.out.printf("%.3f square meters", area);

    }
}