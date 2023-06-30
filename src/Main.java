import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userInput = new int[6];
        int[] computerInput = new int[6];
        int validation = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Geef een getal tussen de 1 en 42. ");
            int input = scanner.nextInt();

            boolean found = false;
            for(int inp: userInput) {
                if (inp == input) {
                    found = true;
                    break;
                }
            }

//            System.out.println(found);

            if (input >= 1 && input <= 42 && !found) {
                userInput[i] = input;
            } else {
                i--;
                System.out.println("Het getal moet tussen de 1 en 42 zijn. ");
            }
        }

        Arrays.sort(userInput);
        System.out.println(Arrays.toString(userInput));

        for (int i = 0; i < 6; i++){
            int random = ThreadLocalRandom.current().nextInt(1, 42);

            boolean found = false;
            for(int inp: computerInput) {
                if (inp == random) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                computerInput[i] = random;
            } else {
                i--;
            }
        }

        Arrays.sort(computerInput);
        System.out.println(Arrays.toString(computerInput));

        for (int i = 0; i < 6; i++) {
            int userNumber = userInput[i];

            for (int j = 0; j < 6; j++) {
                int computerNumber = computerInput[j];

                if (userNumber == computerNumber) {
                    validation++;
                }
            }
        }

        System.out.println("Aantal punten: " + validation);

        switch (validation) {
            case 3:
                System.out.println("Je wint 10 euro!");
                break;
            case 4:
                System.out.println("Je wint 1.000 euro!");
                break;
            case 5:
                System.out.println("Je wint 100.000 euro!");
                break;
            case 6:
                System.out.println("Je wint 10.000.000 euro!");
                break;
            default:
                System.out.println("Je wint helemaal niets!");
        }
    }
}
