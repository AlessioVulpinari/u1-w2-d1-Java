package exercise_1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arrayOfNum = new int[5];

        for (int i = 0; i < arrayOfNum.length; i++) {
            Random random = new Random();
            int num = random.nextInt(1, 10);
            arrayOfNum[i] = num;
        }

        int num = 1;
        Scanner scanner = new Scanner(System.in);
        while (num != 0) {
            System.out.println("Inserisci un numero da 1 a 5");
            int input;
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input <= arrayOfNum.length && input >= 0) {
                    num = input;
                    if (num > 0) System.out.println(arrayOfNum[num - 1]);
                }
            } catch (InputMismatchException | NumberFormatException err) {
                System.out.println("Inserisci un numero!");
            }
        }
        scanner.close();
    }
}
