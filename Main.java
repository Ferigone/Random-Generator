import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        System.out.println("Hello in random GENERATOR 2000");

        System.out.println("Do you want to generate your own range of characters of DEFAULT?  o = OWN / d = DEFAULT");
        Scanner answer1 = new Scanner(System.in);
        String answer_1 = answer1.nextLine();

        String def = "d";
        String own = "o";

        if (answer_1.equals(own)){

            System.out.println("Give the characters you want to draw a random string from");
            Scanner characters = new Scanner(System.in);
            String ch = characters.nextLine();

            System.out.println("Set range");
            Scanner range = new Scanner(System.in);
            int rn = Integer.parseInt(range.nextLine());

            Random r = new Random();

               for (int i = 0; i < rn; i++)
               {
               System.out.print(ch.charAt(r.nextInt(ch.length())));
               }

               return;
        }
        if(answer_1.equals(def))
        {
            System.out.println("Set range");
            Scanner range = new Scanner(System.in);
            int rn = Integer.parseInt(range.nextLine());

            Random r = new Random();
             String alphabet = "qwertyuiopasdfghjklzxcvbnm1234567890";
                   for (int i = 0; i < rn; i++) {
               System.out.print(alphabet.charAt(r.nextInt(alphabet.length())));
               }
        }
        else{
            System.out.println("Type correct answer!");
        }
    }
}


