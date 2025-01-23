package navies;
import captains .baseCaptain;

public class BaseNavies {
    private String  nome ;
    private int  vita ;
    private int  posizione ;
    private baseCaptain captain ;
  /*  private int forza;*/

    public BaseNavies(String nome, int vita /*int forza*/) {
        this.nome = nome;
        this.vita = vita;
        this.posizione = 0;
       /* this.forza = forza;*/
    }

    public String getNome() {
        return nome;
    }

    public int getVita() {
        return vita;
    }

    public void setVita(int vita) {
        this.vita = vita;
    }

    public int getPosizione() {
        return posizione;
    }

    public void setPosizione(int posizione) {
        this.posizione = posizione;
    }

    /* public int getforza() {
            return forza;
        }

        public void setForza(int forza) {
            this.forza = forza;
        } */
    public void attacco (){

    }
    public void move (){
        posizione++ ;
    }
    public baseCaptain getCaptain() {
        return captain; // Ritorna il capitano associato
    }
}

