package exercise_0;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Testing with the debugger

        // 1 array and for loops
        String[] names = {"Alessio", "Cristian", "Federico", "Davide"};

        for (int i = 0; i < names.length; i++) {
            // breakpoint here to see the index and the names in that position
            System.out.println("Indice" + " " + i + " nome: " + names[i]);
        }

        // While + scanner + switch case

        System.out.println("Inserisci una Stringa...");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // While
        while (!Objects.equals(input, "Esci")) {
            // Breakpoint here
            System.out.println("Inserisci una stringa.");
            System.out.println("Oppure inserisci Esci per uscire dal ciclo.");
            input = sc.nextLine();
            System.out.println(input);
        }

        System.out.println("Inserisci un nome...");
        System.out.println();
        String input2 = sc.nextLine();

        // Switch
        switch (input2) {
            case "Alessio":
                // Breakpoint here
                System.out.println("Ti chiami Alessio");
                break;
            case "Alessia":
                // Breakpoint here
                System.out.println("Ti chiami Alessia");
                break;
            case "Alessandro":
                // Breakpoint here
                System.out.println("Ti chiami Alessandro");
                break;
            case "Alessandra":
                // Breakpoint here
                System.out.println("Ti chiami Alessandra");
                break;

            default:
                // Breakpoint here
                System.out.println("Non puoi entrare!");

        }
    }
}
