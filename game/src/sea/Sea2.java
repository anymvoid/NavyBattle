package sea;

import navies.BaseNavies;
import java.util.Random;

public class Sea2  extends  baseSea{
    public Sea2 (String nome){
        super(nome);}

    public void appliccaeffetto(BaseNavies navies) {
        if (!navies.getNome().equals("Ombra del Crepuscolo") && navies.getNome().equals("Furia del Maelstrom")) {
            Random random = new Random();
            int retrocessione = random.nextInt(3);
            navies.setPosizione(navies.getPosizione() - retrocessione); // Retrocede la posizione della nave
            System.out.println(navies.getNome() + "Lambiente fa retrocedere  la nave  di " + retrocessione + " caselle.");
        } else
            navies.move();
}}



