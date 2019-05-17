import java.util.*;

public class Reverse{

    public static void main(String[] args){
        Scanner rev = new Scanner(System.in);

        System.out.println("Enter String: ");

        String kol = rev.nextLine();

        String reverse = "";

        for(int x = kol.length()-1; x>=0; x--){

            reverse +=kol.charAt(x);
        }
    System.out.println("The reverses string is " + reverse);


        rev.close();
    }


}