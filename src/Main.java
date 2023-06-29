import javax.sound.midi.Soundbank;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList userInput = new ArrayList();
        ArrayList computerInput = new ArrayList();

        //For loop gebruiken i.p.v. while
        //Ongewenste waarde is i--
        for (int i = 0; i < 6; i++) {
            System.out.print("Geef een getal tussen de 1 en 42. ");
            int input = scanner.nextInt();

            if (input >= 1 && input <= 42) {
                userInput.add(input);
                System.out.println(userInput);
            } else {
                i--;
                System.out.println("Het getal moet tussen de 1 en 42 zijn. ");
            }
        }

        // Computer inputs 6 different figures between 1 and 42 in an array
        for (int i = 0; i < 6; i++){
            int random = ThreadLocalRandom.current().nextInt(1, 42);
            System.out.println(random);
            computerInput.add(random);
            System.out.println(computerInput);
        }
    }
}
