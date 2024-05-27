package exercise_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci i kilometri percorsi...");
            int km = Integer.parseInt(scanner.nextLine());
            System.out.println("Inserisci i litri di carburante consumati...");
            int liters = Integer.parseInt(scanner.nextLine());
            int result = km / liters;
            System.out.println("Il consumo è di " + result + " km/litro");
        } catch (ArithmeticException err) {
            System.out.println("Non si può dividere per 0!");
        } catch (NumberFormatException err) {
            System.out.println("Non hai inserito un numero!");
        }

        scanner.close();
    }
}
