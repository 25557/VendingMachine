import java.util.*;

public class Vending {
    public static void main(String[] args) {
        System.out.println("VENDING MACHINE");
        System.out.println("SNICKERS: €0,90");
        System.out.println("MILKYWAY: €0,95");
        System.out.println("TWIX: €1,00");
        System.out.println("KITKAT: €0,85");

        int SNICKERS = 90;
        int MILKYWAY = 95;
        int KITKAT = 85;
        int TWIX = 100;
        int tien, vijf;
        int keuze = 0;
        int geld = 0;
        int amount = 0;

            System.out.println("Selecteer jouw product.");
            Scanner input = new Scanner(System.in);
            keuze = input.nextInt();


            System.out.println("Hoeveel cent heeft u?");

            geld = input.nextInt();

            if (geld < 85) {
                System.out.println("Je moet boven de 85 cent invullen.");
            }
            if (geld > 100) {
                System.out.println("Je moet onder de 100 cent invullen.");
            }
            if ((geld < 85) || (geld > 100)) {
                //
            }


            switch (keuze) {
                case 1:

                    System.out.println("Je hebt " + geld + "cent ingeworpen.");
                    System.out.println("Je hebt SNICKERS gekozen. - .90");
                    amount = geld - SNICKERS;

                    System.out.println("Jouw wisselgeld: " + amount + "cent");
                    System.out.println(" Je krijgt dit terug: ");

                    amount = amount % 25;
                    tien = amount / 10;
                    amount = amount % 10;
                    vijf = amount / 5;

                    System.out.println(tien + " stuiver(s)");
                    System.out.println(vijf + " kwartje(s)");
                    System.out.println("Bedankt! En geniet van jouw product.");

                    break;

                case 2:

                    System.out.println("Je hebt " + geld + " cent ingeworpen.");
                    System.out.println("Jouw wisselgeld: " + amount + " cent");
                    amount = geld - MILKYWAY;
                    System.out.println(" Je krijgt dit terug: ");

                    amount = amount % 25;
                    tien = amount / 10;
                    amount = amount % 10;
                    vijf = amount / 5;

                    System.out.println(tien + " stuiver(s)");
                    System.out.println(vijf + " kwartje(s)");
                    System.out.println("Bedankt! En geniet van jouw product.");

                    break;

                case 3:

                    System.out.println("je hebt " + geld + " cent ingeworpen.");
                    System.out.println("Je hebt TWIX gekozen. - 1,00");
                    amount = geld - TWIX;
                    System.out.println("Jouw wisselgeld: " + amount + " cent.");
                    System.out.println(" Je krijgt dit terug: ");

                    amount = amount % 25;
                    tien = amount / 10;
                    amount = amount % 10;
                    vijf = amount / 5;

                    System.out.println(tien + " stuiver(s)");
                    System.out.println(vijf + " kwartje(s)");
                    System.out.println("Bedankt! En geniet van jouw product.");

                    break;

                case 4:

                    System.out.println("Je hebt: " + geld + " cent ingeworpen.");
                    System.out.println("Je hebt KITKAT gekozen -.85");
                    amount = geld - KITKAT;
                    System.out.println("Jouw wisselgeld: " + amount + " cent");
                    System.out.println("Je krijgt dit terug: ");

                    amount = amount % 25;
                    tien = amount / 10;
                    amount = amount % 10;
                    vijf = amount / 5;

                    System.out.println(tien + " stuiver(s)");
                    System.out.println(vijf + " kwartje(s)");
                    System.out.println("Bedankt! En geniet van jouw product.");

                    break;

                default:

                    System.out.println("Je moet een keuze maken tussen 1 en 4.");
            }
    }
}