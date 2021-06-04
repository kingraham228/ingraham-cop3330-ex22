package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.Scanner;

public class NumberSorter {
    Scanner input = new Scanner(System.in);

    public double [] get3Numbers(){
        double number;
        int numberCount = 0;
        double [] gather = {0,0,0};

        do{
            String inputOrder = switch(numberCount){
                case 0 -> "first";
                case 1 -> "second";
                default -> "third";
            };

            System.out.println("Enter the "+inputOrder+" number: ");
            while(!input.hasNextDouble()){
                String testStr = input.next();
                System.out.println(testStr+" is not a valid number.");
                System.out.println("Enter the "+inputOrder+" number: ");
            }
            number = input.nextDouble();
            gather[numberCount] = number;

            numberCount = numberCount+1;

        } while (numberCount<3);

        return gather;
    }

    public double sortArray(double [] numArray3){
        double largestNumber;
        if(numArray3[0]>numArray3[1]){
            largestNumber = numArray3[0];
        }else{
            largestNumber = numArray3[1];
        }

        if (!(largestNumber > numArray3[2])) {
            largestNumber = numArray3[2];
        }
        return largestNumber;

    }
}
