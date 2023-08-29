package Carryon;

import java.util.Scanner;

public class Carryon {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        String variableOne;

        while(true){
            System.out.println("Shall we carry on?");
             variableOne = scanner.nextLine();
             if(variableOne.equals("no")){
                 break;
             }
        }


    }

}
