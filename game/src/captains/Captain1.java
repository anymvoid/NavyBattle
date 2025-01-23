package captains;
import navies.BaseNavies;

public class Captain1 extends baseCaptain {

    public Captain1(String nome,  int forza ,String arma) {
        super(nome,forza, arma);
    }
    public  int  attack (BaseNavies  enemy ){
          int damage =  this.getForza() ;
          enemy.setVita(enemy.getVita()- damage);  //  tolgo i punti dell' attacco alla  nave nemica
          return damage ;


    }


}

