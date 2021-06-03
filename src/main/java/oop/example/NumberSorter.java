package oop.example;

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
}
