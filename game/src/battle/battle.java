package battle;

import navies.Navy1;
import navies.Navy2;
import sea.Sea1;
import sea.Sea2;
import sea.Sea3;
import sea.baseSea;

import java.util.Scanner;
import java.util.Random ;


public class battle {
    public void Battle_acction(Navy1 navy1, Navy2 navy2) {
        Scanner scanner = new Scanner(System.in);
        boolean continueGame = true;
        while (continueGame) {
            System.out.println("Welcome to the Ship Battle!");
            int navy1Damage = navy1.captain1.attack(navy2);
            int navy2Damage = navy2.captain2.attack(navy1);
            //System.out.println("\nYou are now battling in: " + ambienteAttuale.getName());
            int random = generambienterandom();

            if (random == 1) {
                navy1.setVita(navy1.getVita() + 100);
            }
            if (random == 1) {
                navy2.setVita(navy2.getVita() + 100);
            }
            while (navy1.getVita() > 0 && navy2.getVita() > 0) {

                System.out.print("Choose your target (1 for " + navy1.getNome() + ", 2 for " + navy2.getNome() + "): ");
                int target = scanner.nextInt();

                // Ship 1 attacks
                if (target == 1) {
                    System.out.println("\n" + navy1.getNome() + " (" + navy1.getVita() + " HP) vs " + navy2.getNome() + " (" + navy2.getVita() + " HP)");
                    navy2.setVita(navy2.getVita() - navy1Damage);


                    // Check if ship 2 is destroyed
                    if (navy2.getVita() <= 0) {
                        System.out.println(navy1.getNome() + " wins!");
                        continueGame = false;
                        break;
                    }
                    continue;
                }
                System.out.println(navy1.getNome() + " attacks " + navy2.getNome() + " for " + navy1Damage + " damage.");

                System.out.println("\n========================================\n");

                // print kte dhe kut te shtypi 2 te sulmoj 2
                if (target == 2) {
                    navy1.setVita(navy1.getVita() - navy2Damage);
                    System.out.println(navy2.getNome() + " attacks " + navy1.getNome() + " for " + navy2Damage + " damage.");
                    // Check if ship 1 is destroyed
                    if (navy1.getVita() <= 0) {
                        System.out.println(navy2.getNome() + " wins!");
                        continueGame = false;
                        break;
                    }
                }
            }
            System.out.print("Do you ant to continiue ?  Yes : 1  , No : 0");
            int decision = scanner.nextInt();
            continueGame = decision == 1;

        }
        scanner.close();
    }



    private int generambienterandom() {
        Random random = new Random();
        return random.nextInt(3);

    }
}
