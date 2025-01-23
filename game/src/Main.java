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
//        Navy3 navy3 = new Navy3("Ombra del Crepuscolo",500/*,20*/);
//        Navy4 navy4 = new Navy4("Vascello delle Anime Erranti",500/*,20*/);
//
//        Captain1 captain1 = new Captain1("Furia del Maelstrom",80,"Martello del Tuono");
//        Captain2 captain2  = new Captain2("Iskra Frostbane",50,"Pugnale delle Glaciazioni");
//        Captain3 captain3 = new Captain3(" Darian Velenar",50,"Lama dell'Oscurità Infinita");
//        Captain4 captain4 = new Captain4("Eryon Soulbane",50,"Arco delle Anime Erranti");


        b.Battle_acction(navy1,navy2);
    }
}
