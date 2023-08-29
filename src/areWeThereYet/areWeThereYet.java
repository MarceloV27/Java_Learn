package areWeThereYet;

import java.util.Scanner;

public class areWeThereYet {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int variableOne;

        while(true){
            System.out.println("Give a number");
            variableOne = Integer.valueOf(scanner.nextLine());
            if(variableOne == 4){
             break;
            }

        }
    }

}
