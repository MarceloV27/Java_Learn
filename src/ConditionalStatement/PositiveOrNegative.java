package ConditionalStatement;

import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Identification of positive number or negative number");


        System.out.println("Enter your digit");
        int testNumber = scanner.nextInt();

        if(testNumber > 0  ){
            System.out.println("Your number is positive");
        }if(testNumber < 0){
            System.out.println("Your number is negative");
        }else{
            System.out.println("Your number is Zero");
        }
        System.out.println("Thank you!");







    }

}
