package ComparingNumbers;

import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int variableOne;
        int variableTwo;


        variableOne = Integer.valueOf(scanner.nextLine());
        variableTwo = Integer.valueOf(scanner.nextLine());

        if( variableOne > variableTwo){
            System.out.println( variableOne + " is greater than " + variableTwo);
        }else if (variableOne < variableTwo){
            System.out.println( variableOne + "is smaller than "+ variableTwo);
        }else if(variableOne == variableTwo){
            System.out.println(variableOne + "equal to " + variableTwo);
        }

    }

}
