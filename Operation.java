import java.util.*;

public class Operation{
    
    
    public static void main(String[] args){

        double Num1;
        double Num2;
        String opera;

        Scanner f = new Scanner(System.in);

        System.out.println("Enter value: ");
            Num1 = f.nextInt();

        System.out.println("Enter value: ");
            Num2 = f.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Enter operator: ");
            opera = op.next();

        

            if(opera.equals("+")){
                System.out.println("The answer is " + (Num1 + Num2));}
            else if(opera.equals("-")){
                System.out.println("The answer is " + (Num1 - Num2));}
            else if(opera.equals("*")){
                System.out.println("The answer is " + (Num1 * Num2));}
            else if(opera.equals("%")){
                System.out.println("The answer is " + (Num1 % Num2));}
            else if(opera.equals("/")){
                System.out.println("The answer is " + (Num1 / Num2));}
            else {
                System.out.println("error");
                
            }

        f.close();





    }



}
