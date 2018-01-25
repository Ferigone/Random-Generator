import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Generator {
    public static void main(String args[]) throws IOException {

        System.out.println("############################ Random GENERATOR 2000 ###########################");
        System.out.println("Do you want to generate your own range of characters or DEFAULT?  o = OWN / d = DEFAULT");
        Scanner answer1 = new Scanner(System.in);
        String answer_1 = answer1.nextLine();

        String def = "d";
        String own = "o";

        if (answer_1.equals(own)){

            System.out.println("Give the characters you want to draw a random string from:");
            Scanner characters = new Scanner(System.in);
            String ch = characters.nextLine();

            System.out.print("Set range: ");
            Scanner range = new Scanner(System.in);
            long rn = Integer.parseInt(range.nextLine());

            System.out.print("Set amount of generates strings: ");
            Scanner multiplier = new Scanner(System.in);
            long x = multiplier.nextInt();
            System.out.println("\n");

            for (long i = 0; i < x; i++) {

                String path = System.getProperty("java.io.tmpdir") + "/generatedString.txt";
                FileWriter fwriter = new FileWriter( path, true);
                PrintWriter outputfile = new PrintWriter(fwriter);

                StringBuilder salt = new StringBuilder();
                Random rnd = new Random();

                while (salt.length() < rn) {
                    int index = (int) (rnd.nextFloat() * ch.length());
                    salt.append(ch.charAt(index));
                }

                String saltStr = salt.toString();

                System.out.println(saltStr);
                outputfile.println(saltStr);
                outputfile.close();


            }
			System.out.println("");

            String yes = "y";
            String no = "n";

            System.out.println("Do you want save it to file? y/n");
            Scanner answer2 = new Scanner(System.in);
            String a = answer2.nextLine();

            if(a.equals(yes)){
                String file_path = System.getProperty("java.io.tmpdir") + "/generatedString.txt";
                System.out.print("Set file path: ");
                Scanner path_1 = new Scanner(System.in);
                String path = path_1.nextLine();


                Calendar cal = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy HH;mm;ss");
                String time =  sdf.format(cal.getTime());

                Files.move(Paths.get(file_path), Paths.get(path + "/generatedString " + time + ".txt"), StandardCopyOption.REPLACE_EXISTING);

        }
            if(a.equals(no))
            {
                return;
            }
            else
                return;
        }

        if(answer_1.equals(def))
        {
            System.out.print("Set range: ");
            Scanner range = new Scanner(System.in);
            long rn = Integer.parseInt(range.nextLine());


            System.out.print("Set amount of generates strings: ");
            Scanner multiplier = new Scanner(System.in);
            long x = multiplier.nextInt();
            System.out.println("\n");

            for (long i = 0; i < x; i++) {

                String path = System.getProperty("java.io.tmpdir") + "/generatedString.txt";
                    FileWriter fwriter = new FileWriter( path, true);
                    PrintWriter outputfile = new PrintWriter(fwriter);

                    String SALTCHARS = "qwertyuiopasdfghjklzxcvbnm1234567890";
                    StringBuilder salt = new StringBuilder();
                    Random rnd = new Random();

                    while (salt.length() < rn) {
                        int index = (int) (rnd.nextFloat() * SALTCHARS.length());
                        salt.append(SALTCHARS.charAt(index));
                    }

                    String saltStr = salt.toString();

                    System.out.println(saltStr);
                outputfile.println(saltStr);
                outputfile.close();
				

            }
			System.out.println("");

            String yes = "y";
            String no = "n";

            System.out.println("Do you want save it to file? y/n");
            Scanner answer2 = new Scanner(System.in);
            String a = answer2.nextLine();

            if(a.equals(yes)){
                String file_path = System.getProperty("java.io.tmpdir") + "/generatedString.txt";
                System.out.print("Set file path: ");
                Scanner path_1 = new Scanner(System.in);
                String path = path_1.nextLine();

                Calendar cal = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy HH;mm;ss");
                String time =  sdf.format(cal.getTime());

                Files.move(Paths.get(file_path), Paths.get(path + "/generatedString " + time + ".txt"), StandardCopyOption.REPLACE_EXISTING);

            }
            if(a.equals(no))
            {
                return;
            }
            else
                return;
        }


        else{
            System.out.println("Type correct answer!");
        }



    }
}


