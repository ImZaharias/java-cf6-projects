package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 *Αποφασίζει αν χιονίζει ή όχι, με βάση τη θερμοκρασία
 * αλλά και το αν βρέχει. Αν βρέχει και η θερμοκρασία
 * είναι < 0, τότε χιονίζει, αλλιώς όχι.
 */

public class SnowingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isSnowing= false;
        int temp = 0;

        System.out.println("Please insert it is if raining(true/false)?");
        isRaining = in.nextBoolean();

        System.out.println("Please insert  the temperature(int)");
        temp = in.nextInt();


        isSnowing = isRaining && ( temp < 10);

        System.out.println("Is snowing: " + isSnowing);
    }
}
