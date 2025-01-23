package captains;
import navies.BaseNavies;
import navies.Navy3;

public class Captain3  extends baseCaptain{



    public Captain3(String nome,  int forza ,String arma) {
        super(nome,forza, arma);
    }
    public  int  attack (BaseNavies enemy ){ // enemy e il nome del parametro  BaseNavies
        int damage =  this.getForza() ;
        enemy.setVita(enemy.getVita()- damage);  //  tolgo i punti dell' attacco alla  nave nemica
        return damage ;


    }
}
