import battle.battle;

import captains.Captain1;
import captains.Captain4;
import captains.Captain2;
import captains.Captain3;
import navies.Navy1;
import navies.Navy2;
import navies.Navy3;
import navies.Navy4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        battle b = new battle();
        Navy1 navy1 = new Navy1("Furia del Maelstrom",400/*,20*/);
        Navy2 navy2 = new Navy2("Regina dei Ghiacci Eterni",500/*,20*/);
        Navy3 navy3 = new Navy3("Ombra del Crepuscolo",500/*,20*/);
        Navy4 navy4 = new Navy4("Vascello delle Anime Erranti",500/*,20*/);

        Captain1 captain1 = new Captain1("Furia del Maelstrom",80,"Martello del Tuono");
        Captain2 captain2  = new Captain2("Iskra Frostbane",50,"Pugnale delle Glaciazioni");
        Captain3 captain3 = new Captain3(" Darian Velenar",50,"Lama dell'Oscurità Infinita");
        Captain4 captain4 = new Captain4("Eryon Soulbane",50,"Arco delle Anime Erranti");


        b.Battle_acction(navy1,navy2);
//        Scanner scanner = new Scanner(System.in);
//
//        // Scelta dei capitani
//        System.out.println("Scegli i due capitani per la battaglia:");
//        System.out.println("1. Kael Fulminar ");
//        System.out.println("2. Iskra Frostbane");
//        System.out.println("3. Darian Velenar");
//        System.out.println("4. Eryon Soulbane");
//
//        System.out.print("Scegli il primo capitano (1-4): ");
//        int scelta1 = scanner.nextInt();
//        System.out.print("Scegli il secondo capitano (1-4): ");
//        int scelta2 = scanner.nextInt();
//
//        baseCaptain capitano1 = null;
//        baseCaptain capitano2 = null;
//
//        // Creazione dei capitani in base alla scelta dell'utente
//        switch (scelta1) {
//            case 1:
//                capitano1 = new Captain1("Kael Fulminar", 150, "Martello del Tuono");
//                break;
//            case 2:
//                capitano1 = new Captain2("Iskra Frostbane", 140, "Spada del Gelo");
//                break;
//            case 3:
//                capitano1 = new Captain3("Darian Velenar", 130, "Lama dell'Oscurità");
//                break;
//            case 4:
//                capitano1 = new Captain4("Eryon Soulbane", 120, "Arco delle Anime Erranti");
//                break;
//            default:
//                System.out.println("Scelta non valida per il primo capitano.");
//                return; // Esci se la scelta è non valida
//        }
//
//        switch (scelta2) {
//            case 1:
//                capitano2 = new Captain1("Kael Fulminar", 150, "Martello del Tuono");
//                break;
//            case 2:
//                capitano2 = new Captain2("Iskra Frostbane", 140, "Spada del Gelo");
//                break;
//            case 3:
//                capitano2 = new Captain3("Darian Velenar", 130, "Lama dell'Oscurità");
//                break;
//            case 4:
//                capitano2 = new Captain4("Eryon Soulbane", 120, "Arco delle Anime Erranti");
//                break;
//            default:
//                System.out.println("Scelta non valida per il secondo capitano.");
//                return; // Esci se la scelta è non valida
//        }
//
//        if (capitano1 == null || capitano2 == null || capitano1 == capitano2) {
//            System.out.println("Scelta non valida o i due capitani sono uguali.");
//            return;
//        }
//
//        // Simulazione di esempio
//        System.out.println("Il capitano 1 scelto è: " + capitano1.getNome());
//        System.out.println("Il capitano 2 scelto è: " + capitano2.getNome());
    }
}
