package sea;

import captains.baseCaptain;
import navies.BaseNavies;
import java.util.Random;

public class Sea3  extends  baseSea{
    public Sea3 (String nome){
        super(nome);
    }
     public void appliccaeffetto(BaseNavies navies){

        if(navies.getNome().equals(" Vascello delle Anime Erranti")){
            Random random = new Random();
            int aumentoforza = random.nextInt(40);

            // Ottieni il capitano generico della nave
            baseCaptain captain = navies.getCaptain();

            // Aggiungi l'aumento di forza al capitano
            captain.setForza(captain.getForza() + aumentoforza);

        } else  {
            Random random2 = new Random();
            int diminuiscivita= random2.nextInt(40);

            navies.setVita(navies.getVita()-diminuiscivita);
            System.out.println("Lambiente toglie"+diminuiscivita +"hp alle navi");

        }
     }
}
