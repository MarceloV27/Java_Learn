package SolveQuadratic;

import java.util.Scanner;

public class quadraticequestions {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String valueAsString = "42";

        System.out.println("Welcome to solve quadratic equations");
        int text = Integer.valueOf(valueAsString);



        System.out.println("Enter your first variable");
        double variable1 = scanner.nextInt();

        System.out.println("Enter your second variable ");
        double variable2 = scanner.nextInt();

        System.out.println("Enter you third variable");
        double variable3 = scanner.nextInt();

        double result = variable2 * variable2 - 4.0 * variable1 * variable3;

        if(result > 0.0){
            double r1 = (-variable2 + Math.pow(result,0.5))/ (2.0* variable1);
            double r2 = (-variable2 - Math.pow(result,0.5))/(2.0 * variable1);
            System.out.println("The roots are " + r1 + "and " + r2);
        }else if(result ==0.0){
        double r1 = -variable2 /(2.0 * variable1);
        System.out.println("The root is" + r1);
        }else{
            System.out.println("The equation has no real roots.");
        }




    }
}
